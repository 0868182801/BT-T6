import java.util.ArrayList;
import java.util.Scanner;
class hangSanhSu extends hanghoa{
    String loai_nguyen_lieu;
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        super.nhap();
        System.out.println("Loai nguyen lieu: ");
        loai_nguyen_lieu = sc.nextLine();
    }
    public String toString() {
        return("\nHang sanh su\tMa hang: "+mahang+"\tTen hang: "+tenhang+"\tNha san xuat: "+nhasx+"\tGia: "+gia+"\tLoai nguyen lieu: "+ loai_nguyen_lieu);
    }
}