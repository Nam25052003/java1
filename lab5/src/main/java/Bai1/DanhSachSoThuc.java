package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSoThuc {

    ArrayList<Double> list = new ArrayList<Double>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("nhap so thuc : ");
            double x = sc.nextDouble();
            list.add(x);
            sc.nextLine();
            System.out.println("ban co muon nhap tiep khong (Y/N) ?");
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void xuat() {
        for (Double double1 : list) {
            System.out.print("      " + double1);
        }
    }

    public void tinhTong() {
        double tong = 0;
        for (Double double1 : list) {
            tong += double1;           
        }
        System.out.print("\n Tong :" + tong);
    }
}
