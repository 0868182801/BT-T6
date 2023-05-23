import java.util.ArrayList;
import java.util.Scanner;
public class hanghoa {
    String mahang, tenhang, nhasx;
    double gia;
    //method nhập
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        mahang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenhang = sc.nextLine();
        System.out.println("Nhap nha san xuat: ");
        nhasx = sc.nextLine();
        System.out.println("Nhap gia: ");
        gia = sc.nextDouble();
    }
    //toString
    public String toString() {
        return("\nMa hang: "+mahang+"\tTen hang: "+tenhang+"\tNha san xuat: "+nhasx+"\tGia: "+gia);
        
    }
}