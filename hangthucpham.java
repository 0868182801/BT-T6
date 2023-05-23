import java.util.ArrayList;
import java.util.Scanner;
class hangThucPham extends hanghoa{
    String ngay_san_xuat, ngay_het_han;
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        super.nhap();
        System.out.println("Ngay san xuat: ");
        ngay_het_han = sc.nextLine();
        System.out.println("Ngay het han: ");
        ngay_san_xuat = sc.nextLine();
    }
    public String toString() {
        return("\nHang thuc pham\tMa hang: "+mahang+"\tTen hang: "+tenhang+"\tNha san xuat: "+nhasx+"\tGia: "+gia+"\tNgay san xuat: "+ ngay_san_xuat +"\tNgay het han: "+ ngay_het_han);
    }
}