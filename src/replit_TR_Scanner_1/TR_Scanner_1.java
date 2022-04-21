package replit_TR_Scanner_1;

import java.util.Scanner;

public class TR_Scanner_1 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        double sayi = scan.nextInt();
        System.out.println("Sayinin kupunun yarisi = " + (sayi*sayi*sayi/2));
    }
}
