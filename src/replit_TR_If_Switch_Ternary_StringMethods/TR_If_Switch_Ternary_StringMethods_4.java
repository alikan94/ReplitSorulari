package replit_TR_If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class TR_If_Switch_Ternary_StringMethods_4 {
    //Char değişken yanıtının değerini test eden
    // ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
    //
    //yanıt a ise,
    //
    //"Talebiniz işleniyor" mesajı yazdırılır
    //
    //yanıt b ise,
    //
    //"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır
    // yanıt c ise,
    //
    //"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
    //
    //başka herhangi bir yanıt değeri için,
    //
    //"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir giris yapiniz : ");
        char input = scan.next().charAt(0);

       if (input=='a'|| input=='b'|| input=='c')
       switch (input){
           case 'a':
               System.out.println("Talebiniz işleniyor");
               break;
           case 'b':
               System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");
               break;
           case 'c':
               System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
               break;
       } else {
           System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
       }

        /* if (input=='a'){
            System.out.println("Talebiniz işleniyor");

        } else if (input=='b'){
            System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");

        } else if (input=='c'){
            System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");

        } else {
            System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
        }

         */

    }
}
