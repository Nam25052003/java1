package bai2_3_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {

    ArrayList<SinhVienPoly> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap ho ten sinh vien: ");
            String name = sc.nextLine();
            if (name == null || name.equals("")) {
                break;
            }
            System.out.println("nhap ten nganh (IT/Biz): ");
            String nganh = sc.nextLine();
            if (nganh.equalsIgnoreCase("IT")) {
                System.out.println("nhap diem Java: ");
                double diemJava = sc.nextDouble();
                System.out.println("nhap diem Css: ");
                double diemCss = sc.nextDouble();
                System.out.println("nhap diem Html: ");
                double diemHtml = sc.nextDouble();
                SinhVienPoly sv = new SinhVienIT(name, nganh, diemJava, diemCss, diemHtml);
                list.add(sv);
            } else if (nganh.equalsIgnoreCase("Biz")) {
                System.out.println("nhap diem Marketing: ");
                double diemMarketing = sc.nextDouble();
                System.out.println("nhap diem Sales: ");
                double diemSales = sc.nextDouble();
                SinhVienPoly sv = new SinhVienBiz(name, nganh, diemMarketing, diemSales);
                list.add(sv);
            }
        } while (true);
    }

    public void xuat() {
        for (SinhVienPoly sinhVienPoly : list) {
            System.out.println("ho va ten: " + sinhVienPoly.getHoTen() + " | nganh: " + sinhVienPoly.getNganh() + " | diem: " + sinhVienPoly.getDiem() + " | hoc luc: " + sinhVienPoly.getHocLuc());
        }
    }

    public void gioi() {
        for (SinhVienPoly sinhVienPoly : list) {
            if (sinhVienPoly.getHocLuc().equalsIgnoreCase("GIOI")) {
                System.out.println("ho va ten: " + sinhVienPoly.getHoTen() + " | nganh: " + sinhVienPoly.getNganh() + " | diem: " + sinhVienPoly.getDiem() + " | hoc luc: " + sinhVienPoly.getHocLuc());
            }
        }
    }

    public void sapxep() {
        Comparator<SinhVienPoly> comp = (SinhVienPoly o1, SinhVienPoly o2) -> Double.compare(o2.getDiem(), o1.getDiem());
        Collections.sort(list, comp);
        xuat();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("1.nhap danh sach sinh vien");
            System.out.println("2.xuat thong tin danh sach sinh vien");
            System.out.println("3.xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4.sap xep sinh vien theo diem");
            System.out.println("5.ket thuc");
            System.out.println("moi chon chuc nang(1,2,3,4,5) : ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    gioi();
                    break;
                case 4:
                    sapxep();
                    break;
                case 5:
                    System.out.println("ket thuc chuong trinh");
                    break;
                default:
                    System.out.println("hay nhap chuc nang trong chuong trinh");
                    break;
            }
        } while (chon != 5);
    }
}
