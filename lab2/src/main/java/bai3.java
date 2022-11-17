
import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhap so dien: ");
            float sodien = scanner.nextFloat();
            if (sodien < 0) {
                System.out.println("nhap so dien phai la so duong ");
            } else if (sodien < 50) {
                System.out.println("so dien (0-50)");
                System.out.println("so tien can phai tra la: " + (sodien * 1000));
            } else if (sodien > 50) {
                System.out.printf("so dien (50-%.2f)\n", sodien);
                System.out.println("so tien can phai tra la: " + ((50 * 1000) + (sodien - 50) * 1200));
            }
        } catch (Exception ex) {
            System.out.println("vui long nhap so");
        }
    }
}
