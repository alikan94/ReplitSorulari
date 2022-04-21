package replit_TR_Scanner_1;

import java.util.Scanner;

public class TR_Scanner_2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

Ornek Cikti :

Alan: 9

Cevre: 12
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Karenin bir kenarini giriniz : ");
        int sayi = scan.nextInt();
        System.out.println("Karenin alani = " + (sayi*sayi));
        System.out.println("Karenin cevresi = " + (sayi*4));
    }
}
