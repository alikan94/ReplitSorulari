package replit_TR_Scanner_1;

import java.util.Scanner;

public class TR_Scanner_6 {
    /*
    Kullanıcıdan bir Float değer girmesini isteyin,
    bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir float sayi gir : ");
        float sayi = scan.nextFloat();
        short sayi2 = (short) sayi;

        System.out.println("Float'tan short'a : " + sayi2);

    }
}
