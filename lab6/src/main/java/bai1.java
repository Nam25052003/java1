
import java.util.ArrayList;
import java.util.Scanner;


public class bai1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap vao ho va ten");
        String name = sc.nextLine();
        name.trim();
        
        String lastname = name.substring(0,name.indexOf(" "));
        String middlename = name.substring(name.indexOf(" "),name.lastIndexOf(" "));
        String firstname = name.substring(name.lastIndexOf(" "));
        
        System.out.printf("%s %s %s",lastname.toUpperCase(),middlename,firstname.toUpperCase());
    }
}
