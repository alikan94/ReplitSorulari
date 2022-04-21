package replit_Eng_For_while;

import java.util.Scanner;

public class R07_Eng_for_while {
    public static void main(String[] args) {
        int sumOfFactors = 0;
        System.out.println("****Welcome to the Perfect Number Finder program.****");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();

        for(int i = 1; i < number; ++i) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }

        if (number == sumOfFactors) {
            System.out.println("Entered number: " + number);
            System.out.println("******Congratulations!*********");
            System.out.println("You found the Perfect Number!");
        } else {
            System.out.println("Entered number: " + number);
            System.out.println("******Unhappily******");
            System.out.println("This number is not perfect.");
        }
    }
}
