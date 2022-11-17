package PolyIT;

public class bai1 {

    public static final double sum(double... x) {
        double tong = 0;
        for (double d : x) {
            tong += d;
        }
        return tong;
    }

    public static void main(String[] args) {
        double sum = sum(3, 4, 5, 6.6);
        System.out.println("tong bang: " + sum);
    }
}
