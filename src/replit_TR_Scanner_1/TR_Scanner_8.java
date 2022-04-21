package replit_TR_Scanner_1;

import java.util.Scanner;

public class TR_Scanner_8 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

Örnek Çıktı:

Verilen tamsayının rakamları toplamı 10'dur.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Uc basamakli bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int basamaklariToplami=0;
        basamaklariToplami+=sayi%10;
        sayi/=10;
        basamaklariToplami+=sayi%10;
        sayi/=10;
        basamaklariToplami+=sayi%10;
        System.out.println("Sayinin basamaklari toplami = " + basamaklariToplami);
    }
}
