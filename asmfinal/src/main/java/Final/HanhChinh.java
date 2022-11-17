
package Final;

public class HanhChinh extends NhanVien{

    public HanhChinh() {
    }

    public HanhChinh(String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
    }

    @Override
    public double getThuNhap() {
        return super.getLuong();
    }  
}
