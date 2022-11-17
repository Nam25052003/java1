package bai1;

import java.util.Scanner;

public class ChuNhat {

    protected double chieuDai;
    protected double chieuRong;   

    public ChuNhat() {
    }

    public ChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChuVi() {
        return 2 * (getChieuDai() + getChieuRong());
    }

    public double getDienTich() {
        return getChieuDai() * getChieuRong();
    }

    public void xuat() {
        System.out.println("chieu dai hinh chu nhat: "+getChieuDai());
        System.out.println("chieu rong hinh chu nhat: "+getChieuRong());
        System.out.println("chu vi hinh chu nhat: "+getChuVi());
        System.out.println("dien tich hinh chu nhat: "+getDienTich());

    }
}
