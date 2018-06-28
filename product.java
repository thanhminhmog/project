package pkg23_tran_minh_khoa;

public class product {
    //field
    private String code;
    private String name;
    private double price1;
    private double price2;
    private int status;
    
    //contructors
    public product() {
        code="";
        name="";
        price1=0;
        price2=0;
        status=0;
    }
    public double checkprice (double price){
        if(price <=0){
            throw new RuntimeException("Invalid price");
        }
        else{
            return price;
        }
    }    
    public product(String code, String name, double price1, double price2, int status) {
        this.code = code;
        this.name = name;
        try{
            checkprice(price1);
            this.price1 = price1;
        }
        catch (Exception e){
            System.out.println("Invalid price1");
        }
        try {
            checkprice(price2);
            this.price2 = price2;
        }
        catch (Exception e){
            System.out.println("Invalid price2");
        }
        this.status = status;
        if(status != 0 && status !=1){
            this.status =0;
        }  
    }

    //method
    String getFullStatus(int status){
        if(status == 0){ return "Ngưng sử dụng";}
        else{ return "Đang sử dụng";}
    }
    void printHeader(){
        System.out.println("Mã hàng"+"  "+"Tên hàng"+"  "+"Giá nhập"+"  "+"Giá bán"+"   "+"Tình trạng");
    }
    void printFooter(int x){
        System.out.println("Tổng số bản ghi:"+x);
    }
    
    void output() {
        String s = String.format("%-8s        %-20s%-10.1f          %-10.1f          %s", code, name, price1, price2, getFullStatus(status));
        System.out.println(s);
    }
}
