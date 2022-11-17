import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        double chieudai = scanner.nextDouble();
        System.out.println("nhap chieu rong: ");
        double chieurong = scanner.nextDouble();
        double chuvi=(chieudai+chieurong)*2;
        double dientich=chieudai*chieurong;
        System.out.println("chu vi: "+chuvi);
        System.out.println("diem tich: "+dientich);
        System.out.println("canh nho nhat: "+Math.min(chieudai,chieurong));
    }
}
