package QuanLyPhongHoc;

import java.util.Objects;

public abstract class PhongHoc {
	public abstract double getDatChuan();

	protected String maPhong, dayNha;
	protected double dienTich;
	protected int soBongDen;

	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoBongDen(soBongDen);
	}

	public PhongHoc() {
		this("", "", 0.0, 0);
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		if (maPhong == null)
			throw new IllegalArgumentException("Dien Tich Khong Duoc De Trong");
		this.maPhong = maPhong;
	}

	public String getDayNha() {
		return dayNha;
	}

	public void setDayNha(String dayNha) {
		if (dayNha == null)
			throw new IllegalArgumentException("Day Phong Khong Duoc de trong");
		this.dayNha = dayNha;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		if (dienTich <= 0)
			throw new IllegalArgumentException("Dien Tich Phai Lon Hon 0");
		this.dienTich = dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		if (soBongDen <= 0)
			throw new IllegalArgumentException("So Bong Den phai Lon Hon 0");
		this.soBongDen = soBongDen;
	}

	public boolean duSang() {
		return (getDienTich() / getSoBongDen() <= 10);
	}

	public abstract boolean getDatChuan();

	@Override
	public String toString() {
		String s = "";
		s += String.format("|%-10|5-10|%-10|%-10|", getMaPhong(), getDayNha(), getDienTich(), getSoBongDen());
		return s;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}

	
}
