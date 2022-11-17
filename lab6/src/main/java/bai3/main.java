
package bai3;

import java.util.ArrayList;

public class main {
    ArrayList<SinhVien> ls = new ArrayList<>();
    
    public void nhap(){
        for (int i = 0; i < 5; i++) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            ls.add(sv);
        }
    }
    
    public void xuat(){
        System.out.println("danh sach sinh vien");
        for (SinhVien ds : ls) {
            ds.xuat();
        }
    }
}
