package replit_TR_Scanner_1;

import java.util.Scanner;

public class TR_Scanner_4 {
    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

1 şeker = 1.7 gr

Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Gunde kac bardak cay icersiniz : ");
        double cayBardakSayisi = scan.nextDouble();
        System.out.println("Kac seker atarsınız : ");
        double sekerAdeti = scan.nextDouble();
        System.out.println("Yıldaki seker tuketiminiz = " + (cayBardakSayisi*sekerAdeti*1.7*365/1000) + " kg'dir.");
    }
}
