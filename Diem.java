import java.util.Scanner;
import java.lang.Math;
public class Diem{
    private int x, y;
	public Diem(int x, int y) {
	this.x=x;
	this.y=y;
	}	
	public void nhapDiem(){
        Scanner s =new Scanner(System.in);
        System.out.println("Toa do diem x ? ");
        setX(s.nextInt());
        System.out.println("Toa do diem y ? ");
        setY(s.nextInt());
}

public void inDiem() {
	System.out.print("(" + x + "," + y+ ")");
}	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}


class TamGiac extends Diem{
	public TamGiac(int x, int y) {
		super(x, y);
	}	
    Diem A = new Diem(0, 0);
    Diem B = new Diem(0, 0);
    Diem C = new Diem(0, 0);	
	double AB, AC, BC;
        int i=0;
	public void nhaptg() {
		System.out.println("Toa do diem A ? ");
		A.nhapDiem();
		System.out.println("Toa do diem B ? ");
		B.nhapDiem();
		System.out.println("Toa do diem C ? ");
		C.nhapDiem();
	}
	
	public void intg() {
		System.out.print("Toa do diem A la : ");
		A.inDiem();
		System.out.println();
		System.out.print("Toa do diem B la : ");
		B.inDiem();
		System.out.println();
		System.out.print("Toa do diem C la : ");
		C.inDiem();
	}   
	public void Ktra() {		
        AB = (Math.sqrt((Math.pow(( B.getX() - A.getX()), 2)) + (Math.pow(( B.getY() - A.getY()), 2))));
	    BC = (Math.sqrt((Math.pow(( C.getX() - B.getX()), 2)) + (Math.pow(( C.getY() - B.getY()), 2))));
	    AC = (Math.sqrt((Math.pow(( C.getX() - A.getX()), 2)) + (Math.pow(( C.getY() - A.getY()), 2))));	    	    
            if(AB + BC < AC && BC + AC < AB && AC + AB < BC)
        {
            System.out.println("\n A, B, C khong la 3 dinh cua tam giac\n");
        }
        else{
            System.out.println("\n A B C la 3 dinh cua ABC\n");
            i++;
            }  
            }
	
	
 public String ChuVi(){
     if(i!=0){
        return "Chu vi tam giac = "+ ( AB + BC + AC );}
     return "khong hop le";
    }

 public String DienTich(){
        double p=( AB + AC + BC )/2;
        if(i!=0){
        return "Dien tich tam giac ABC="+(Math.sqrt(p*(p - AB)*(p - BC)*(p - AC)));}
        return " khong co ket qua";
}}

class DuongTron extends Diem{
	private int r;

	public DuongTron(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}	
	public void nhapDT() {
		Scanner dt = new Scanner(System.in);
		System.out.print("Nhap toa do diem O(X,Y) : ");
		setX(dt.nextInt());
		setY(dt.nextInt());	
		System.out.print("Nhap ban kinh R : ");
		setR(dt.nextInt());
	}	
	public void inDT() {
		System.out.println("Tam cua duong tron la : "+"("+getX()+","+getY()+")");
		System.out.println("Ban kinh cua duong tron la : "+r);
	}
	public void chuviDT() {
		double cvdt = (2 * r) * Math.PI;
		System.out.println("Chu vi cua duong tron la : "+cvdt);
	}	
	public void dientichDT() {
		double dtdt = r * r * Math.PI;
		System.out.println("Dien tich cua hinh tron la : "+dtdt);
	}
}


