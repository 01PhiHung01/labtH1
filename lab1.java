package lab1.thuchanh;
import java.util.Scanner;
public class Vehicle {
    public String tenchuxe;
    public String loaixe;
    public double dungtich;
    public double trigia;
    public double thuephainop;
    public double thue;
public Vehicle(String tenchuxe,String loaixe,double dungtich,double trigia) {
    this.tenchuxe=tenchuxe;
    this.loaixe=loaixe;
    this.dungtich=dungtich;
    this.trigia=trigia;
    thuephainop();
}
    public void thuephainop() {
        if (dungtich<100) {
            thue = (trigia*1/100);
        }else {
            if (dungtich>=100 && dungtich<=200) {
              thue= (trigia*3/100);
        }else {
            if (dungtich>200) {
                thue = (trigia*5/100);
            }
            }
        }   
    }
    public String getTenchuxe() {
        return tenchuxe;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public double getDungtich() {
        return dungtich;
    }

    public double getTrigia() {
        return trigia;
    }

    public double getThuephainop() {
        return thuephainop;
    }
    
    public double getThue(){
        return thue;
    } 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Vehicle[] a = new Vehicle[3];
       
       for(int i=0;i<a.length;i++) {
           System.out.println("Nhập thông tin xe"+(i+1)+":");
           System.out.print("Tên chủ xe: ");
           String chuxe = input.nextLine();
           System.out.print("Loại xe: ");
           String loaixe=input.nextLine();
           System.out.print("Dung tích: ");
           double dungtich = input.nextDouble();
           System.out.println("Trị giá: ");
           double trigia = input.nextDouble();
           input.nextLine();
           a[i] = new Vehicle(chuxe,loaixe,dungtich,trigia);
       }
       System.out.println("Bảng kê khai tiền thuế của các xe");
    System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n","Tên chủ xe","Loại xe","Dung tích","Trị giá","Thuế phải nộp");
    for (int i = 0;i<a.length;i++) {
    System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n",a[i].getTenchuxe(),a[i].getLoaixe(),a[i].getDungtich(),a[i].getTrigia(),a[i].getThue());
}
}
}
