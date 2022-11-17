package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLiSanPham {

    private ArrayList<SanPham> ds = new ArrayList<>();

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap ten san pham: ");
            String ten = sc.nextLine();
            if (ten.equals("")) {
                System.out.println("da nhap xong");
                break;
            }
            System.out.println("nhap gia san pham: ");
            double gia = sc.nextDouble();
            ds.add(new SanPham(ten, gia));
        } while (true);
        }

    
    public void sapXepGiamDan() {
        Comparator<SanPham> comp = (SanPham o1, SanPham o2) -> Double.compare(o2.getGiaSP(), o1.getGiaSP());
        Collections.sort(ds,comp);
        xuat();
    }

    public void xoa() {
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham can tim:");
        String ten = sc.nextLine();
        SanPham sp = null;
        for (SanPham sp1 : ds){
            if(sp1.getTenSP().equals(ten)){
                sp= sp1;
                break;
            }
        }
        if(sp!= null){
            ds.remove(sp);
            System.out.println("Da xoa san pham!!!");
        }else{
            System.out.println("Khong tim thay san pham ???");
        }
    }

    public void giaTB() {
        double tb = 0, tong = 0 ;
        for (SanPham d : ds) {
            tong += d.getGiaSP();
        }
        tb = tong/ds.size();
        System.out.println("gia trung binh la: "+ tb);
    }
    
    public void xuat() {
        System.out.println("xuat danh sach san pham");
        for (SanPham sp : ds) {
            System.out.printf(" ten sp: %s | gia sp: %.2f  \n", sp.getTenSP(), sp.getGiaSP());
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Sap xep giam dan theo gia va xuat ra man hinh");
            System.out.println("3. tim va xoa cac san pham theo ten ");
            System.out.println("4. xuat gia trung binh cua cac san pham");
            System.out.println("5. thoat");
            System.out.println("----------------------------------------------------");
            System.out.println("moi chon chuc nang(1,2,3,4,5) :");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapXepGiamDan();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    giaTB();
                case 5:
                    System.out.println("thoat chuong trinh !");
            }
        } while (chon != 5);
    }
}
