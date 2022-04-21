package replit_TR_If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class TR_If_Switch_Ternary_StringMethods_2 {
    public static void main(String[] args) {
        //Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        //
        //Input :
        //
        //John White
        //
        //1234234534561478
        //
        //Output : Name :
        //
        //J*** W****
        //
        //CCN : **** **** **** 1478
        //
        //Ilk Harfler Buyuk harf ile baslamalidir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Isminiz : ");
        String isim = scan.nextLine();
        System.out.println("Soyisminiz : ");
        String soyisim = scan.nextLine();
        System.out.println("16 haneli Kart no giriniz : ");
        String kartNo = scan.nextLine();

        System.out.print("Isim : " + isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*") + " ");
        System.out.println("Soyisim : " + soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*") + " ");
        System.out.println("Kart No: **** **** **** " + kartNo.substring(12));

    }
}
