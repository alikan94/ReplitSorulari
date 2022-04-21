package replit_Eng_For_while;

import java.util.Scanner;

public class R04_Eng_for_while {
    public static void main(String[] args) {
        /*
            Write a return method that accepts an integer as input and calculates factorial and prints like output.

            Input : 6

            Output: 6!=65432*1=720
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number greater than one : ");
        int input = scan.nextInt();
        int product = 1;

        for (int i = input; i > 0; i--) {
            product *= i;
            if (i == input) {
                if (i == 1) {
                    System.out.print(i + "=" + product);
                } else {
                    System.out.print(input);
                }
            } else if (i == 1) {
                System.out.print("*" + i + "=" + product);
            } else {
                System.out.print("*" + i);
            }
        }
    }
}
