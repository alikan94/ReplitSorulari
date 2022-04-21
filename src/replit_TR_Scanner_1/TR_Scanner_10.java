package replit_TR_Scanner_1;

import java.util.Scanner;

public class TR_Scanner_10 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Karenin bir kenarini giriniz : ");
        int dakika = scan.nextInt();
        int yil = 0;
        int gun = 0;

        // 1 saat 60 dk
        // 1 gün 1440 dk
        // 1 yil 525600 dk dir.

        yil = dakika / (60 * 24 * 365);
        gun = (dakika - (yil * 60 * 24 * 365)) / (60 * 24);

        System.out.println(dakika + " dakika yaklasik olarak " + yil + " yil " + gun + " gundur.");


    }
}
