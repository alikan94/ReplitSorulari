package replit_TR_If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class TR_If_Switch_Ternary_StringMethods_8 {

    //Kullanıcıdan bir isim girmesini isteyin
    // ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
    //
    //Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
    //
    //INPUT : Mustafa
    //
    //OUTPUT : fafafa

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 isim gir : ");
        String isim = scan.next();

        if (isim.length()>=2){

            System.out.print(isim.substring(isim.length()-2));
            System.out.print(isim.substring(isim.length()-2));
            System.out.println(isim.substring(isim.length()-2));

        } else {
            System.out.println("isim 2 harften fazla olmali");
        }

    }
}
