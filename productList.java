/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23_tran_minh_khoa;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author taruk
 */
public class productList {
    //field
    private product[] list= null;
    private int count=0;
    private int size=0;
    
    //constructor
    public productList(int size) {
        if(size<=0){ size=1;}
        this.size = size;
        list= new product[size];
    }

    public void checksize(int size, int count){
        if (size < count){
            throw new RuntimeException("List is full");
        }        
    }
    
    //method
    public void setList(){
        File f= new File("Product.txt");
        try{
            Scanner sc= new Scanner(f);
            sc.useDelimiter("[\\n]+");
            while(sc.hasNext()){
                String s= sc.next();
                if(!s.trim().equals("")){
                    String arr[]= s.split("[\\t]+");
                    product pro= new product(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]));
                    this.list[count++]= pro;
                    if(count == list.length){ break;}                   
                }
                try{
                    checksize(size, count);
                }
                catch (Exception e){
                    System.out.println(e);
                    break;
                }
            }
        }
        catch(Exception e){
            System.out.println("Product List "+e);
        }
    }
    public void output(){
        product pd = new product();
        pd.printHeader();
        for(int i=0; i<count; i++){
        list[i].output();
        }
        pd.printFooter(list.length);
    }
}
