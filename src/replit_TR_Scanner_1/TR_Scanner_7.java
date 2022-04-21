package replit_TR_Scanner_1;

import java.util.Scanner;

public class TR_Scanner_7 {
    public static void main(String[] args) {
        /*
        Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Double veri turu bir sayi giriniz : ");
        double sayi = scan.nextDouble();
        int yeniSayi = (int) sayi;
        System.out.println("Sayinin tam sayi hali = " + yeniSayi);
    }
}
