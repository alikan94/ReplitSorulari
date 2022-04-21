package replit_TR_If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class TR_If_Switch_Ternary_StringMethods_6 {
    public static void main(String[] args) {
        // Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
        // Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        //
        // Eger aynı karakterlere sahipse
        //
        // "isim ayni karakterlere sahiptir." yazdirin.
        //
        //Eger ayni kaakterlere sahip degilse
        //
        //"Dizenin benzersiz karakterleri var" yazdirin.
        //
        //Ternary kullanin.
        Scanner scan = new Scanner(System.in);
        System.out.println("3 karakter uzunlugunda ad giriniz : ");
        String ad = scan.next();
        int adUzunluk=ad.length();

        if (adUzunluk == 3) {
            if ((ad.charAt(0) == ad.charAt(1) || ad.charAt(0) == ad.charAt(2))) {
                System.out.println("isim ayni karakterlere sahiptir.");
            } else {
                if ((ad.charAt(1) == ad.charAt(2))) {
                    System.out.println("isim ayni karakterlere sahiptir.");
                } else {
                    System.out.println("Dizenin benzersiz karakterleri var");
                }
            }
        } else {
            System.out.println("Adin uzunlugu 3 olmalidir.");
        }

        /*
        (ad.charAt(1)==ad.charAt(2)
                                ?
                                (System.out.println("isim ayni karakterlere sahiptir."))
                                :(System.out.println("Dizenin benzersiz karakterleri var"))
                :(System.out.println("Adin uzunlugu 3 olmalidir.")))
         */

    }
}
