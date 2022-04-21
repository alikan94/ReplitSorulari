package replit_TR_Scanner_1;

import java.util.Scanner;

public class TR_Scanner_9 {
    public static void main(String[] args) {
        /*
        Girilen zamanı saniyeye çeviren bir program yazınız.

Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Saat giriniz : ");
        int saat = scan.nextInt();
        System.out.println("Dakika giriniz : ");
        int dakika = scan.nextInt();
        System.out.println("Saniye giriniz : ");
        int saniye = scan.nextInt();
        System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye girdiniz.");
        saniye=(saat*60*60)+(dakika*60)+saniye;
        System.out.println("Toplam " + saniye + " yapmaktadir.");
    }
}
