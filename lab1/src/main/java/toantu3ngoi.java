
import java.util.Scanner;

public class toantu3ngoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a : ");
        int a = sc.nextInt();
        System.out.println("nhap so b : ");
        int b = sc.nextInt();
        System.out.println("nhap so c : ");
        int c = sc.nextInt();
        int max = a>b?a>c?a:c:b;
        System.out.println(max);
        
    }
}
