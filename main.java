
public class main {
    public static void main(String[] args) {
		TamGiac tg = new TamGiac(0, 0);
		tg.nhaptg();
		tg.intg();		
		tg.Ktra();
		System.out.println(tg.ChuVi());
		System.out.println(tg.DienTich());
		
		DuongTron dt = new DuongTron(0,0,0);
		dt.nhapDT();
		dt.inDT();
		dt.chuviDT();
		dt.dientichDT();
    }
}