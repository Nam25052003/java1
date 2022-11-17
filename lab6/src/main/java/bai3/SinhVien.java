package bai3;

import java.util.Scanner;

public class SinhVien {

    private String hoTen;
    private String email;
    private String phoneNum;
    private String cMND;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String email, String phoneNum, String cMND) {
        this.hoTen = hoTen;
        this.email = email;
        this.phoneNum = phoneNum;
        this.cMND = cMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap vao ho ten");
            hoTen = sc.nextLine();
            if (hoTen == null | hoTen.equals("")) {
                System.out.println("vui long nhap vao ho ten");
            } else {
                break;
            }
        } while (true);

        KiemTra kt = new KiemTra();
        do {
            System.out.println("nhap vao email");
            email = sc.nextLine();
            if (kt.isEmail(email)) {
                break;
            } else {
                System.out.println("email k hop le");
            }
        } while (true);

        do {
            System.out.println("nhap vao so dien thoai");
            phoneNum = sc.nextLine();
            if (kt.isPhoneNum(phoneNum)) {
                break;
            } else {
                System.out.println("so dien thoai k hop le");
            }
        } while (true);

        do {
            System.out.println("nhap vao so CMND");
            cMND = sc.nextLine();
            if (kt.isCMND(cMND)) {
                break;
            } else {
                System.out.println("so CMND k hop le");
            }
        } while (true);
    }
    
    public void xuat(){
        System.out.printf("ho va ten: %s | email: %s | so dien thaoi: %s | so CMND: %s \n",hoTen,email,phoneNum,cMND);        
    }
}
