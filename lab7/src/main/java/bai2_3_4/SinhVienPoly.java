package bai2_3_4;

import java.util.Scanner;

public abstract class SinhVienPoly {

    protected String hoTen;
    protected String nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        String hocLuc = null;
        double diem = getDiem();
        if (diem >= 9) {
            hocLuc = "XUAT SAC";
        } else if (diem >= 7.5) {
            hocLuc = "GIOI";
        } else if (diem >= 6.5) {
            hocLuc = "KHA";
        } else if (diem >= 5) {
            hocLuc = "TRUNG BINH";
        } else {
            hocLuc = "YEU";
        }
        return hocLuc;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("nhap vao nganh: ");
        this.nganh = sc.nextLine();
    }
    
    public void xuat(){
        System.out.println("ho va ten: "+getHoTen()+" | nganh hoc: "+getNganh()+"  | diem: "+getDiem()+"  | hoc luc: "+getHocLuc());
    }
}
