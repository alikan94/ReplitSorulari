package replit_TR_If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class TR_If_Switch_Ternary_StringMethods_3 {
    public static void main(String[] args) {
        // Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve
        // yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan
        // fazla basamakli olursa, "OverFlow" yazdırın.
        //Ornek:
        //INPUT :
        //25
        //46
        //OUTPUT :
        //Numaralarin Toplami:
        //71

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("Bir sayi daha giriniz : ");
        int sayi2 = scan.nextInt();
        int toplam;
        int sayac=0;

        if (sayi1>=0 && sayi2>=0){
            toplam=sayi1+sayi2;
            while (toplam>0){
                toplam/=10;
                sayac++;
            }
            if (sayac<10){
                System.out.println("sayilarin toplami = " + (sayi1+sayi2));
            } else {
                System.out.println("OverFlow");
            }
        } else {
            System.out.println("Gecersiz giris oldu.");
        }


    }
}
