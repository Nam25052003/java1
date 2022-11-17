package PolyIT;

import static PolyIT.XPoly.max;
import static PolyIT.XPoly.min;
import static PolyIT.XPoly.sum;
import static PolyIT.XPoly.toUpperFirstChar;
import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        double minn, maxx, summ;
        minn = min(2, 5, 7, 1, 4, 3);
        maxx = max(2, 5, 7, 1, 4, 3);
        summ = sum(2, 5, 7, 1, 4, 3);
        int chon = 0;
        do {
            System.out.println("cho cac gia tri: 2,5,7,1,4,3");
            System.out.println("cho chuoi :\"nguyen phuong nam\"");
            System.out.println("1.Tinh tong");
            System.out.println("2.Min.");
            System.out.println("3.Max.");
            System.out.println("4.In hoa chu cai dau.");
            System.out.println("5.Thoat.");
            System.out.println("--------------------------------");
            System.out.println("chon chuc nang muon chon(1,2,3,4,5) : ");

            try {
                chon = sc.nextInt();
                if (chon != 0) {
                    switch (chon) {
                        case 1:
                            System.out.println("tong: " + summ);
                            break;
                        case 2:
                            System.out.println("min: " + minn);
                            break;
                        case 3:
                            System.out.println("max: " + maxx);
                            break;
                        case 4:
                            System.out.println(toUpperFirstChar("nguyen phuong nam"));
                            break;
                        case 5:
                            System.out.println("THOAT CHUONG TRINH !!!");
                            break;
                        default:
                            System.out.println("nhap chuc nang trong menu");
                    }
                }
            } catch (Exception e) {
                System.out.println("vui long nhap so");
            }

        } while (chon != 5);
    }
}
