package replit_Eng_For_while;

import java.util.Scanner;

public class R09_Eng_for_while {
    public static void main(String[] args) {
        /*
        Write a java program to reverse the number which user entered.

        Input :1238
        Output :Reverse Of The Number: 8321

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        int input = scan.nextInt();
        int reverseInput = 0;

        System.out.println("Input : " + input);
        while (input > 0) {

            reverseInput += (input % 10);
            input /= 10;
            if (input>0){
                reverseInput*=10;
            }
        }
        System.out.println("Sayinin Tersi : " +reverseInput);

    }
}
