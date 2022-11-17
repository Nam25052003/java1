package polyIT;

import java.util.Scanner;

public class SanPham {

    private String tenSP;
    private double donGia;
    private double giamGia;

    SanPham() {

    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;   
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamgia() {
        return giamGia;
    }

    public void setGiamgia(double giamgia) {
        this.giamGia = giamgia;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void nhap(){
        Scanner scanf = new Scanner(System.in);
        System.out.println("Nhap vao ten San Pham: ");
        this.tenSP = scanf.nextLine();
        System.out.println("Nhap vao gia San Pham: ");
        this.donGia = scanf.nextDouble();
        System.out.println("Nhap vao Giam Gia: ");
        this. giamGia = scanf.nextDouble();
    }   
    public void xuat() {
        System.out.println("ten san pham la: " + tenSP);
        System.out.println("don la: " + donGia);
        System.out.println("giam gia la: " + giamGia);
        System.out.println("thue nhap khau la: " + getThueNhapKhau());
    }

}


