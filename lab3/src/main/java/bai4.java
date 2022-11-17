
import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so sinh vien muon nhap");
        int n = sc.nextInt();

        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap ho va ten sinh vien thu " + (i + 1) + ":");
            sc.nextLine();
            a[i] = sc.nextLine();
        }
        float b[] = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap diem sinh vien thu " + (i + 1) + ":");
            b[i] = sc.nextFloat();
        }
        System.out.println("-->hoc luc cua sinh vien theo thu tu<--");
        for (int i = 0; i < n; i++) {
            if (b[i] >= 9 && b[i] <= 10) {
                System.out.println("hoc luc xuat sac");
            } else if (7.5 <= b[i] && b[i] < 9) {
                System.out.println("hoc luc gioi");
            } else if (6.5 <= b[i] && b[i] < 7.5) {
                System.out.println("hoc luc kha");
            } else if (5 <= b[i] && b[i] < 6.5) {
                System.out.println("hoc luc trung binh");
            } else if (b[i] >= 0 && b[i] < 5) {
                System.out.println("hoc luc yeu");
            } else {
                System.out.println("nhap loi!");
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i] < b[j]) {
                    float tam = b[i];
                    b[i] = b[j];
                    b[j] = tam;

                    String tam2 = a[i];
                    a[i] = a[j];
                    a[j] = tam2;
                }
            }
        }
        System.out.println("-->danh sach sinh vien duoc sap xep theo diem tang dan<--");
        for (int i = 0; i < n; i++) {
            System.out.println("ten sinh vien: " + a[i] + " diem: " + b[i]);
        }
    }
}
