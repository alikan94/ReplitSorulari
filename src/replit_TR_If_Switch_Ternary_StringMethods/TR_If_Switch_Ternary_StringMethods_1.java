package replit_TR_If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class TR_If_Switch_Ternary_StringMethods_1 {
    public static void main(String[] args) {

        /*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

BMI 18,5'in altındaysa zayıfsınız

BMI 18,5 ile 25 arasında ise kilonuz idealdir

BMI 25-30 arasındaysa şişmansınız

BMI 30'dan büyük veya eşitse, obez

Input:

Output:

Agirlik : 71

Boy : 1,72

BMI : 23.99945916711736

Zayifsiniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Agirlik : ");
        double agirlik = scan.nextDouble();
        System.out.println("Boy : ");
        double boy = scan.nextDouble();

        double bMI = agirlik/(boy*boy);

        System.out.println(bMI);

        if (bMI>= 30){
            System.out.println("Obezsiniz");
        } else if (bMI>= 25){
            System.out.println("Sismansiniz");
        } else if (bMI>= 18.5){
            System.out.println("Ideal kilodasiniz");
        } else {
            System.out.println("Zayifsiniz");
        }

    }
}
