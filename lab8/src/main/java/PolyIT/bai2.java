
package PolyIT;


public class bai2 {
    public static final double sum(double... x) {
        double tong = 0;
        for (double d : x) {
            tong += d;
        }
        return tong;
    }

    public static double min(double... x) {
        double min = x[0];
        for (double d : x) {
            min = Math.min(min, d);
        }
        return min;
    }

    public static double max(double... x) {
        double max = x[0];
        for (double d : x) {
            max = Math.max(max, d);
        }
        return max;
    }

    public static void main(String[] args) {
        double sum = sum(3, 4, 5, 6.6);
        double min = min(3, 4, 5, 6.6);
        double max = max(3, 4, 5, 6.6);
        System.out.println("tong bang: " + sum);
        System.out.println("min bang: " + min);
        System.out.println("max bang: " + max);
    }
}
