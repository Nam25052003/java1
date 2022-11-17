
import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("ban muon bang cuu truong nao");
//        int x = sc.nextInt();
        System.out.println("-->bang cuu chuong<--");
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d =%d \n", i, j, i * j);    
            }

        }
    }
}
