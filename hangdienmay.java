import java.util.ArrayList;
import java.util.Scanner;
class hangdienmay extends hanghoa {
    String tg_bao_hanh;
    int dien_ap;
    double cong_suat;
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        super.nhap();
        System.out.println("Thoi gian bao hanh: ");
        tg_bao_hanh = sc.nextLine();
        System.out.println("Dien ap: ");
        dien_ap = sc.nextInt();
        System.out.println("Cong suat: ");
        cong_suat = sc.nextDouble();
    }
    public String toString() {
        return("\nHang dien may\tMa hang: "+mahang+"\tTen hang: "+tenhang+"\tNha san xuat: "+nhasx+"\tGia: "+gia+"\tThoi gian bao hanh: "+(String)tg_bao_hanh +"\tDien ap: "+dien_ap+"\tCong suat: "+cong_suat);
    }
}