
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap gia tri a: ");
        int a = scanner.nextInt();
        System.out.println("nhap gia tri b: ");
        int b = scanner.nextInt();
        System.out.println("nhap gia tri c: ");
        int c = scanner.nextInt();
        double delta= (Math.pow(b,2)-4*a*c);
        System.out.println("can denta: "+ Math.sqrt(delta));
    }
    
}
