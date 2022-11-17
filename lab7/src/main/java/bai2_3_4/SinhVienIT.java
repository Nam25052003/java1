package bai2_3_4;

import java.util.Scanner;

public class SinhVienIT extends SinhVienPoly {

    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public SinhVienIT() {
    }

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap diem Java: ");
        this.diemJava = sc.nextByte();
        System.out.println("nhap diem Css: ");
        this.diemCss = sc.nextByte();
        System.out.println("nhap diem Html: ");
        this.diemHtml = sc.nextByte();
    }
      
    @Override
    public double getDiem() {
        return (2*getDiemJava()+getDiemCss()+getDiemHtml())/4;
    }
    
    public static void main(String[] args) {
        SinhVienIT svit = new SinhVienIT();
        svit.nhap();
        svit.xuat();
    }
}
