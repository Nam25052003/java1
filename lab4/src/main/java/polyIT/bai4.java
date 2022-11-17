
package polyIT;

public class bai4 {
      public static void main(String[] args) {
       SanPham sp1= new SanPham("xemay",20000,20);
       String ten = sp1.getTenSP();
        System.out.println("Ten sp: "+ten);
        sp1.xuat();
    }
    
}

