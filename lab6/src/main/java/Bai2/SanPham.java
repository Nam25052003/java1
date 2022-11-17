package Bai2;

import java.util.Scanner;

public class SanPham {

    private String tenSP;
    private double donGia;
    private String hang;

    public SanPham() {
    }

    public SanPham(String tenSP, double donGia, String hang) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.hang = hang;
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

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten san pham");
        tenSP = sc.nextLine();
        System.out.println("nhap vao gia san pham");
        donGia = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap hang");
        hang = sc.nextLine(); //hang=new Scanner(System.in).nextLine();
    }

    public void xuat() {
        System.out.println("***********************");
        System.out.println("ten san pham: " + tenSP);
        System.out.println("don gia: " + donGia);
        System.out.println("hang: " + hang);
    }

}
