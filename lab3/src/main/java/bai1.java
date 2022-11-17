
import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("nhap so n: ");
            int n = sc.nextInt();
//            boolean ok = true;
            int ok = 0;
            if (n < 2) {
                System.out.println("k phai so nguyen to");
            }
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
//                    ok = false;
//                    break;
                    ok++;
                }
//                i++;

            }
            if (ok == 0) {
                System.out.println("la so nguyen to");
            } else {
                System.out.println("k phia la so nguyen to");
            }

        } catch (Exception ex) {
            System.out.println("hay nhap so");
        }
    }

}
