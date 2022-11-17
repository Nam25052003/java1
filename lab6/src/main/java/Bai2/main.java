package Bai2;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }
        for (SanPham sanPham : list) {
            if (sanPham.getHang().equalsIgnoreCase("Nokia")) {
                sanPham.xuat();
                System.out.println();
            }
        }
    }
}
