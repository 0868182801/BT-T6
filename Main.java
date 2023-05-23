import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<hanghoa> dsHH = new ArrayList<hanghoa>();
        Scanner sc = new Scanner(System.in);
        int lc;
        //menu
        do{
            System.out.println("\n1. Nhap hang dien may\n2. Nhap hang thuc pham\n3. Nhap hang sanh su\n4. In toan bo danh sach\n0. Thoat");
            System.out.println("Nhap lua chon cua minh: ");
            lc = sc.nextInt();
        switch(lc){
            case 1:
                {
                    hangdienmay dm = new hangdienmay();
                    dm.nhap();
                    dsHH.add(dm);
                    break;
                }
            case 2:
            {
                hangThucPham tp = new hangThucPham();
                tp.nhap();
                dsHH.add(tp);
                break;
            }
            case 3:
            {
                hangSanhSu ss = new hangSanhSu();
                ss.nhap();
                dsHH.add(ss);
                break;
            }
            case 4:
            {
                if(dsHH.size()==0){ 
                    System.out.println("Danh sach rong!"); 
                    break;}
                else 
                    for(hanghoa i : dsHH){
                    System.out.println(i);
                    System.out.println();}
                    break;
            }
            default: {
                System.out.println("Da thoat");
                break;
            }
        }
    }while(lc != 0);
    }
}