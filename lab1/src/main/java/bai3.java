
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chieu dai canh: ");
        double canh = scanner.nextDouble();
        System.out.println("the tich lap phuong: "+Math.pow(canh,3));
    }
}
