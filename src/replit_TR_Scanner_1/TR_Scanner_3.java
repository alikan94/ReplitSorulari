package replit_TR_Scanner_1;

import java.util.Scanner;

public class TR_Scanner_3 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdortgenin bir kenarini giriniz : ");
        int kenar1 = scan.nextInt();
        System.out.println("Dikdortgenin diger kenarini giriniz : ");
        int kenar2 = scan.nextInt();
        System.out.println("Dikdortgenin alani = " + (kenar1*kenar2));
        System.out.println("Dikdortgenin cevresi = " + ((kenar1+kenar2)*2));
    }
}
