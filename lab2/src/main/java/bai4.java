
import java.util.Scanner;

public class bai4 {

    public static void bai1(String[] args) {
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

    public static void bai2(String[] args) {
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
            System.out.println("vui long nhap so !!!");
        }
    }

    public static void bai3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhap so dien: ");
            float sodien = scanner.nextFloat();
            if (sodien < 0) {
                System.out.println("nhap sai ");
            } else if (sodien < 50) {
                System.out.println("so dien (0-50)");
                System.out.println("so tien can phai tra la: " + (sodien * 1000));
            } else if (sodien > 50) {
                System.out.printf("so dien (50-%.2f)\n", sodien);
                System.out.println("so tien can phai tra la: " + ((50 * 1000) + (sodien - 50) * 1200));
            }
        } catch (Exception ex) {
            System.out.println("vui long nhap so !!!");
        }
    }

    public static void main(String[] args) {
        try {
            int chon = 0;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("+-----------------------------------+");
                System.out.println("1. phuong trinh bac nhat ");
                System.out.println("2. phuong trinh bac 2 ");
                System.out.println("3. tinh tien dien ");
                System.out.println("4. thoat ");
                System.out.println("+-----------------------------------+");
                System.out.println("5. chon chuc nang (1,2,3,4) ");
                chon = scanner.nextInt();
                switch (chon) {
                    case 1:
                        bai1(args);
                        break;
                    case 2:
                        bai2(args);
                        break;
                    case 3:
                        bai3(args);
                        break;
                    case 4:
                        System.out.println("-->thoat chuong trinh<--");

                }
            } while (chon != 4);
        } catch (Exception e) {
            System.out.println("vui long nhap so !!!");
        }
    }
}
