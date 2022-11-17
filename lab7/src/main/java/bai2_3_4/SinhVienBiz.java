package bai2_3_4;

import java.util.Scanner;

public class SinhVienBiz extends SinhVienPoly {

    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap diem Marketing: ");
        this.diemMarketing = sc.nextByte();
        System.out.println("nhap diem Sales: ");
        this.diemSales = sc.nextByte();
    }

    @Override
    public double getDiem() {
        return (2*getDiemMarketing()+getDiemSales())/3;
    }

    public static void main(String[] args) {
        SinhVienBiz svb = new SinhVienBiz();
        svb.nhap();
        svb.xuat();
    }
}
