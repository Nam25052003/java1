
import java.util.Scanner;

public class bai5 {

    /*bai 5: nhap vao mang so nguyen 5 phan tu, tim ra so nguyen to xuat hien dau tien trong mang. Neu co in so do ra. 
neu khong co so nguyen to nao, xuat ra, 
"mang ko co chua so nguyen to". Bonus Xoa số đó ra khỏi mảng in mảng sau cùng. */
    public static boolean check(int n) {
        if (n <= 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n, c, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so phan tu mang: ");
        n = scanner.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        System.out.println("\n cac so nguyen to trong mang la: ");
        for (i = 0; i < n; i++) {
            if (check(a[i])==false) {
                System.out.print(a[i] + "\t");
            }
        }
        System.out.println("\n nhap so nguyen to muon xoa khoi mang: ");
        int k = scanner.nextInt();

        for (c = i = 0; i < n; i++) {
            if (a[i] != k) {
                a[c] = a[i];
                c++;
            }
        }
        n = c;
        System.out.println("\n cac so con lai trong mang la: ");
        for (i = 0; i < n; i++) {
            if (check(a[i])) {
                System.out.print(a[i] + "\t");
            }
        }
    }
}
