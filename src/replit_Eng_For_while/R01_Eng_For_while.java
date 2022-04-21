package replit_Eng_For_while;

import java.util.Scanner;

public class R01_Eng_For_while {
    public static void main(String[] args) {
        /*

        Ask user to enter a name and a character, then check how many times the character is repeated
        in the name using loops in the name

        e.g:

        char ch1= 'a' ;

        String name =“John came late"

        Expected Output: Number of a = 2

        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence : ");
        String sentence = scan.nextLine().toLowerCase();
        System.out.println("Please enter a character : ");
        char ch = scan.next().toLowerCase().charAt(0);

        int counter = 0;
        int number = 0;

        while (number<sentence.length()){

            if (sentence.charAt(number)==ch){
                counter++;
            }

            number++;
        }

        System.out.println("Number of a = " + counter);

    }
}
