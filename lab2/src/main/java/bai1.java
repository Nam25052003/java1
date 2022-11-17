
import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhap gia tri a=");
            int a = scanner.nextInt();
            System.out.println("nhap gia tri b=");
            int b = scanner.nextInt();

            if (a == 0) {
                if (b == 0) {
                    System.out.println("vo so nghiem");
                } else {
                    System.out.println("vo nghiem");
                }
            } else {
                System.out.println("co nghiem la: " + (-b / a));
            }
        } catch (Exception ex) {
            System.out.println("vui long nhap so !!!");
            
        }
    }

}
