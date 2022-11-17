package Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {

    ArrayList<NhanVien> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Chon chuc vu: ");
            System.out.println("0.Thoát");
            System.out.println("1.Nhan vien hanh chinh");
            System.out.println("2.Nhan vien tiep thi");
            System.out.println("3.Truong Phong");
            int sys = sc.nextInt();
            switch (sys) {
                case 1 -> {
                    HanhChinh nvhc = new HanhChinh();
                    nvhc.nhap();
                    list.add(nvhc);
                }
                case 2 -> {
                    TiepThi tt = new TiepThi();
                    tt.nhap();
                    list.add(tt);
                }
                case 3 -> {
                    TruongPhong tp = new TruongPhong();
                    tp.nhap();
                    list.add(tp);
                }
            }
            if (sys == 0) {
                break;
            }
        } while (true);

    }

    public void xuat() {
        for (NhanVien nv : list) {
            if (nv instanceof HanhChinh) {
                nv.xuatThongTin();
            } else if (nv instanceof TiepThi) {
                nv.xuatThongTin();
            } else if (nv instanceof TruongPhong) {
                nv.xuatThongTin();
            }
        }
    }

    public void tim() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ma so nhan vien: ");
        String maNV = sc.nextLine();
        boolean check = false;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                check = true;
                if (nv instanceof HanhChinh) {
                    nv.xuatThongTin();
                } else if (nv instanceof TiepThi) {
                    nv.xuatThongTin();
                } else if (nv instanceof TruongPhong) {
                    nv.xuatThongTin();
                }
            }
        }
        if (check == false) {
            System.out.println("khong tim thay nhan vien!!!");
        }
    }

    public void xoa() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ma nhan vien muon xoa: ");
        String maNV = sc.nextLine();
        boolean check = false;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                check = true;
                list.remove(nv);
                System.out.println("da xoa thanh cong!!!");
                break;
            }
        }
        if (check == true) {
            System.out.println("khong tim thay nhan vien!!!");
        }
    }

    public void capNhat() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ma nhan vien muon cap nhan: ");
        String maNV = sc.nextLine();
        boolean check = false;
        for (NhanVien nv : list) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                check = true;
                if (nv instanceof HanhChinh) {
                    nv.nhap();
                } else if (nv instanceof TiepThi) {
                    nv.nhap();
                } else if (nv instanceof TruongPhong) {
                    nv.nhap();
                }
            }
        }
        if (check == true) {
            System.out.println("khong tim thay nhan vien!!!");
        }
    }

    public void timTheoLuong() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("nhap khoang luong bat dau: ");
            double luongbd = sc.nextDouble();
            System.out.printf("nhap khoang luong ket thuc: ");
            double luongkt = sc.nextDouble();
            if (luongbd > luongkt) {
                System.out.println("nhap lai");
            } else {
                break;
            }
        } while (true);
        for (NhanVien nv : list) {
            double luongbd = 0;
            double luongkt = 0;
            if (nv.getThuNhap() >= luongbd && nv.getThuNhap() <= luongkt) {
                if (nv instanceof HanhChinh) {
                    nv.xuatThongTin();
                } else if (nv instanceof TiepThi) {
                    nv.xuatThongTin();
                } else if (nv instanceof TruongPhong) {
                    nv.xuatThongTin();
                }
            }
        }
    }

    public void sapXepTheoTen() {
        Collections.sort(list, (o1, o2) -> (int) (o1.getHoTen().compareTo(o2.getHoTen())));
        for (NhanVien nv : list) {
            if (nv instanceof HanhChinh) {
                nv.xuatThongTin();
            } else if (nv instanceof TiepThi) {
                nv.xuatThongTin();
            } else if (nv instanceof TruongPhong) {
                nv.xuatThongTin();
            }
        }
    }

    public void sapXepTheoLuong() {
        Collections.sort(list, (o1, o2) -> (int) (o2.getThuNhap() - o1.getThuNhap()));
        for (NhanVien nv : list) {
            if (nv instanceof HanhChinh) {
                nv.xuatThongTin();
            } else if (nv instanceof TiepThi) {
                nv.xuatThongTin();
            } else if (nv instanceof TruongPhong) {
                nv.xuatThongTin();
            }
        }
    }

    public void top5NVThuNhapCaoNhat() {
        sapXepTheoLuong();
        int i = 1;
        for (NhanVien nv : list) {
            if (nv instanceof HanhChinh) {
                nv.xuatThongTin();
            } else if (nv instanceof TiepThi) { //instanceof la toan tu so sanh " kieu" , vi so sanh the hien voi kieu du lieu
                nv.xuatThongTin();
            } else if (nv instanceof TruongPhong) {
                nv.xuatThongTin();
            }
            i++;
            if (i == 5) {
                break;
            } else if (i != 5) {
                System.out.println("chua du 5 nhan vien");
            }
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {

            System.out.println("+--------------------------------------------------------------------+");
            System.out.println("| chuc nang 1: nhap danh sach nhan vien tu ban phim                  |");
            System.out.println("| chuc nang 2: xuat danh sach nhan vien ra man hinh                  |");
            System.out.println("| chuc nang 3: tim va hien thi nhan vien theo ma nhap tu ban phim    |");
            System.out.println("| chuc nang 4: xoa nhan vien theo ma nhap tu ban phim                |");
            System.out.println("| chuc nang 5: cap nhan thông tin nhan vien thao ma nhap tu ban phim |");
            System.out.println("| chuc nang 6: tim cac nhan vien theo muc luong nhap tu ban phim     |");
            System.out.println("| chuc nang 7: sap xep nhan vien theo ho va ten                      |");
            System.out.println("| chuc nang 8: sap xep nhan vien theo thu nhap                       |");
            System.out.println("| chuc nang 9: xuat 5 nhan vien co thu nhap cao nhat                 |");
            System.out.println("| chuc nang 0: thoat                                                 |");
            System.out.println("+--------------------------------------------------------------------+");
            System.out.println("chon chuc nang (1,2,3,4,5,6,7,8,9,0) : ");
            try {
                chon = sc.nextInt();
                switch (chon) {
                    case 1 ->
                        nhap();
                    case 2 ->
                        xuat();
                    case 3 ->
                        tim();
                    case 4 ->
                        xoa();
                    case 5 ->
                        capNhat();
                    case 6 ->
                        timTheoLuong();
                    case 7 ->
                        sapXepTheoTen();
                    case 8 ->
                        sapXepTheoLuong();
                    case 9 ->
                        top5NVThuNhapCaoNhat();
                    case 0 ->
                        System.out.println("thoat chuong trinh");
                    default ->
                        System.out.println("vui long nhap chuc nang trong menu");
                }
            } catch (Exception e) {
                System.out.println("vui long nhap so");

            } finally {
                sc.nextLine();
            }
        } while (chon != 0);

    }
}
