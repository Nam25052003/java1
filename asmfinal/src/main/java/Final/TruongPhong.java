package Final;

import java.util.Scanner;

public class TruongPhong extends NhanVien {

    private double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(String hoTen, String maNV, double luong, double trachNhiem) {
        super(hoTen, maNV, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + this.trachNhiem;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tien trach nhiem: ");
        trachNhiem = sc.nextDouble();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.println("trach nhiem: "+this.trachNhiem);
    }
    
    
}
