
import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("nhap cac phan tu mang");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("sap xep tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        int minn = a[0];
        for (int i = 0; i < n; i++) {
            if (minn > a[i]) {
                minn = a[i];
            }
        }
        System.out.println("\ngia tri nho nhat trong mang la: " + minn);
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                dem++;
                tong += a[i];
            }
        }
        System.out.println("trung binh cong cac phan tu chia het cho 3 la:" + (tong/dem));
    }
}
