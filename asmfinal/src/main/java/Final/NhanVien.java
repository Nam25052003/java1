package Final;

import java.util.Scanner;

public abstract class NhanVien {

    protected String maNV;
    protected String hoTen;
    protected double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public abstract double getThuNhap();

    public double getThueTN() {
        if (this.getThuNhap() < 9000000) {
            return 0;
        } else if (this.getThuNhap() >= 9000000 && getThuNhap() <= 15000000) {
            return this.getThuNhap() * 0.1;
        } else {
            return this.getThuNhap() * 0.12;
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten nhan vien: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap ma so nhan vien: ");
        this.maNV = sc.nextLine();
        System.out.println("Nhap luong nhan vien: ");
        this.luong = sc.nextDouble();
    }

    public void xuatThongTin() {
        System.out.println("ho ten nhan vien: "+ getHoTen());
        System.out.println("ma so nhan vien: "+getMaNV());
        System.out.println("luong nhan vien: "+getLuong());
        System.out.println("thu nhap: "+getThuNhap());
        System.out.println("thue thu nhap: "+getThueTN());
    }
}
