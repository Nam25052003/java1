import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ho và ten: ");
        String hoten= scanner.nextLine();
        System.out.println("diem TB: ");
        double diemTB= scanner.nextDouble();
        System.out.print(hoten+" "+diemTB+"\n");
        System.out.printf("%s %.2f \n",hoten,diemTB);
        System.out.println(hoten +" "+ diemTB);
    }
    
}
