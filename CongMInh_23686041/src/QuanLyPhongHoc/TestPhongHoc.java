package QuanLyPhongHoc;

public class TestPhongHoc {
	public static void main(String[] args) {
		ListPhongHoc ph = new ListPhongHoc();
		ph.themPhong(new PhongLT("A0", "Day A", 100, 30, true));
		ph.themPhong(new PhongMT("H04", "Day H", 90, 25, 60));
		ph.themPhong(new PhongMT("H07", "Day H", 120n, 40, 70));
		ph.themPhong(new PhongTN("B02", "Day B", 80, 35, "Hoa Hoc", 40, true));
		System.out.println();
	}
	

}