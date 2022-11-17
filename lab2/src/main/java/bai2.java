
import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhap gia tri a= ");
            int a = scanner.nextInt();
            System.out.println("nhap gia tri b= ");
            int b = scanner.nextInt();
            System.out.println("nhap gia tri c= ");
            int c = scanner.nextInt();
            double delta = 0, x1 = 0, x2 = 0;
            delta = Math.pow(b, 2) - 4 * a * c;
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            if (a == 0) {
                if (a == 0) {
                    if (b == 0) {
                        System.out.println("vo so nghiem");
                    } else {
                        System.out.println("vo nghiem");
                    }
                } else {
                    System.out.println("co nghiem la: " + (-b / a));
                }
            } else {
                if (delta < 0) {
                    System.out.println("vo nghiem");
                } else if (delta == 0) {
                    System.out.println("nghiem kep" + (-b / (2 * a)));
                } else if (delta > 0) {
                    System.out.println("2 nghiem phan biet");
                    System.out.println("nghiem 1" + x1);
                    System.out.println("nghiem 2" + x2);
                }
            }
        } catch (Exception ex) {
            System.out.println("vui long nhap so !");
        }
    }
}
