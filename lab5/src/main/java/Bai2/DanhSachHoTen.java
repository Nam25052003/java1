package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachHoTen {
    private ArrayList<String> ds = new ArrayList<String>();
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--->nhap danh sach ho ten<--- ");
        while (true) {            
            System.out.println("nhap vao ho va ten: ");
            String ten = sc.nextLine();
            if(ten.isBlank()){
                System.out.println("done !");
                break;
            }
            ds.add(ten);
        }
        
    }
    public void xuat(){
        for (String d : ds) {
            System.out.println(d);
        }
    }
    
    public void xuatNgauNhien(){
        Collections.shuffle(ds);
        xuat();
    }
    
    public void sapXepGiam(){
        Collections.sort(ds);
        Collections.reverse(ds);
        xuat();
    }
    public void timVaXoa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten muon xoa");
        String hoten = sc.nextLine();
        
        for (String d : ds) {
            if(d.equalsIgnoreCase(hoten)){
                ds.remove(d);
                System.out.println("xoa thanh cong");
                break;
            }
        }
        xuat();
    }
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("1.nhap danh sach ho ten");
            System.out.println("2.xuat danh sach vua nhap");
            System.out.println("3.xuat danh sach ngau nhien");
            System.out.println("4.sap xep giam dan va xuat danh sach");
            System.out.println("5.tim va xoa ho ten nhap tu ban phim");
            System.out.println("6.ket thuc");
            System.out.println("moi cac ban chon(1,2,3,4,5,6) :");
            chon = sc.nextInt();
            switch (chon) {
                case 6:
                    System.out.println("thoat chuong trinh !!! ");
                    break;
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatNgauNhien();
                    break;
                case 4:
                    sapXepGiam();
                    break;
                case 5:
                    timVaXoa();
                    break;
               
            }

        } while (chon != 6);
    }
}
