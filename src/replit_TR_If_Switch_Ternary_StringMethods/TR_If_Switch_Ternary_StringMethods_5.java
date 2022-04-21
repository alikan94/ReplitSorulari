package replit_TR_If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class TR_If_Switch_Ternary_StringMethods_5 {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:

Ay Numarasi:

2

Yil :

2016

OUTPUT :

Subat 2016 29 Gundur.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir aydaki gun sayisini hesaplayan program");
        System.out.println("Hangi yil? : ");
        int yil = scan.nextInt();
        System.out.println("Ay numarasini giriniz : ");
        int ayNo = scan.nextInt();

        System.out.println("Girdiginiz ay numarasi : " + ayNo);
        System.out.println("Girdiginiz yil : " + yil);

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiginiz ay 31 gundur.");
                break;
            case 2:
                if (yil % 4 == 0) {
                    System.out.println("Girdiginiz ay 29 gundur.");
                } else {
                    System.out.println("Girdiginiz ay 28 gundur.");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiginiz ay 30 gundur.");
                break;
        }
    }
}

