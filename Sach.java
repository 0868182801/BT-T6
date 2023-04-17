
import  java.util.Scanner;

public  class  Sach{
private  String  ma, ten, tg, loai, nxb;
private  int  trang, tap,  gia;

public Sach(String ma, String ten, String tg, int trang, String loai, String nxb, int tap, int gia)
{ 
this.ma = ma;  
this.ten = ten;  
this.tg = tg;
this.trang = trang;  
this.loai = loai;  
this.nxb = nxb;
this.tap = tap;
this.gia = gia;
}

public  void  INSACH()
{
System.out.println("Ma sach: "+this.ma+"; Ten sach: "+this.ten+"; Tac gia: " +this.tg+"; So Trang: "+this.trang+"; Loai sach: "+this.loai +"; NXB: "+this.nxb+"; Tap: "+this.tap+"; Gia sach: "+this.gia);
}

public  static  void  main(String[]  args)
{
String  ma, ten, tg, loai, nxb; 
int trang, gia , tap;
Scanner  s=  new Scanner(System.in);
System.out.println("Nhap Ma sach, ten sach, tac gia, so trang, loai sach, NXB, so tap, gia:  "); 
ma = s.nextLine();
ten = s.nextLine(); 
tg = s.nextLine();
trang = s.nextInt();
loai = s.nextLine(); 
nxb = s.nextLine();
tap = s.nextInt();
gia = s.nextInt();

Sach sach = new Sach(ma, ten, tg, trang, loai, nxb, tap, gia); 
sach.INSACH();
}
}
