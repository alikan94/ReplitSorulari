package replit_Eng_For_while;

import java.util.Scanner;

public class R02_Eng_for_while {
    public static void main(String[] args) {
        /*
        Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

        Input :

        30 and 40

        Expected OutPut:

        GCD for 30 and 40 = 10

        LCM for 30 and 40 = 120

         */
        Scanner scan = new Scanner(System.in);

        int LCM = 0;
        int LCMMax;
        int GCD = 0;

        System.out.println("GCD (Greatest Common Divisor) and LCM (Least Common Multiple) finder");
        System.out.println("Please enter a number: ");
        int number1 = scan.nextInt();
        System.out.println("Please enter another number : ");
        int number2 = scan.nextInt();

        LCMMax = number1 * number2;


        for (int i = LCMMax; i > 0; i--) {
            if (i % number1 == 0 && i % number2 == 0) {
                LCM = i;
            }
        }

        System.out.println("LCM for " + number1 + " and " + number2 + " = " + LCM);

        for (int i = 1; i < number1 && i < number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                GCD = i;
            }
        }
        System.out.println("GCD for " + number1 + " and " + number2 + " = " + GCD);


    }
}
