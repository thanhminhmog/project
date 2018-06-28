/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23_tran_minh_khoa;

/**
 *
 * @author taruk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  System.out.print("Hello");
	System.out.print("Welcome to my app");

        productList lis= new productList(10);
        lis.setList();
        lis.output();
    }
    
}
