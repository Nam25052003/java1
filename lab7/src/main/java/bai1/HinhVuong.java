
package bai1;

public class HinhVuong extends ChuNhat {
    
    public HinhVuong() {
    }

    public HinhVuong(double chieuDai) {
        super(chieuDai, chieuDai);
    }

    @Override
    public void xuat() {
        System.out.println("chieu dai canh: "+getChieuDai());    
        System.out.println("chu vi : "+getChuVi());
        System.out.println("dien tich: "+getDienTich());
    }
    
    
}
