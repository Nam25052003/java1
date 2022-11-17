
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen duong");
        int n = sc.nextInt();
        if (n % 15 == 0) {
            System.out.println("chia het cho 15");
        } else if (n % 5 == 0) {
            System.out.println("chia het cho 5");
        } else if (n % 3 == 0) {
            System.out.println("chia het cho 3");
        } else {
            System.out.println("thoat");
        }
    }
}

