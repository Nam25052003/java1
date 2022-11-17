package PolyIT;

public class XPoly {

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

    public static String toUpperFirstChar(String s) {
        String ars[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ars.length; i++) {
            String ar = ars[i];
            if (!ar.equals("")) {
                String fi = ar.substring(0, 1).toUpperCase();
                ar = fi + ar.substring(1).toLowerCase();
                sb.append(ar).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        double sum = sum(3, 4, 5, 6.6);
        double min = min(3, 4, 5, 6.6);
        double max = max(3, 4, 5, 6.6);
        System.out.println("tong bang: " + sum);
        System.out.println("min bang: " + min);
        System.out.println("max bang: " + max);
        System.out.println("--------------------------------");
        String name = toUpperFirstChar(" nguyen  phuong  nam ");
        System.out.println(name);
    }
}
