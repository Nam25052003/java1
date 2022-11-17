
package polyIT;


public class bai2 {
     public static void main(String[] args) {
        SanPham sp2[]= new SanPham[2];
        for(int i=0;i<sp2.length;i++){
            SanPham sp = new SanPham();
            sp.nhap();
            sp2[i]=sp;
        }
        for(SanPham sp:sp2){
            sp.xuat();
            System.out.println("");
        }
    }
    
}


