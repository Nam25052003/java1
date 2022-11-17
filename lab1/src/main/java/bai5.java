
import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
//        Scanner scaner=new Scanner(System.in );
//        System.out.println("nhap min : ");
//        float min = scaner.nextInt();
//        System.out.println("nhap max : ");
//        float max = scaner.nextInt();
//        float ran = (float)(Math.random()*((max-min)+1)+min);
        for (int i = 0; i < 10; i++) {
            float ran = (float) (Math.random() * 7) + 5;
            System.out.printf("so ngau nhien: %.2f \n ", ran);
//            System.out.printf("can so ngau nhien: %.2f", Math.sqrt(ran));
        }
    }

}
