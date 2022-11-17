package Final;

import java.util.Scanner;

public class TiepThi extends NhanVien {

    private double doanhSo;
    private double hueHong;

    public TiepThi() {
    }

    public TiepThi(double doanhSo, double hueHong) {
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public TiepThi(String hoTen, String maNV, double luong, double doanhSo, double hueHong) {
        super(hoTen, maNV, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    @Override
    public double getThuNhap() {
        return super.getLuong()+this.getDoanhSo()+this.getHueHong();
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("doanh so: ");
        doanhSo = sc.nextDouble();
        System.out.println("hue hong: ");
        hueHong = sc.nextDouble();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.println("doanh so: "+this.hueHong);
        System.out.println("hue hong: "+this.hueHong);
    }
    
    

}
