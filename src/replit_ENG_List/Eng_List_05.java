package replit_ENG_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eng_List_05 {
    public static void main(String[] args) {
        //Write a program that accepts an integer as input
        // and prints first 10 prime numbers greater than input Check numbers
        // if they are even or not in a return method.
        //
        //Input : 5
        //
        //Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin : ");
        int input = scan.nextInt();
        int counter = 0;
        int counterFinderPrimes = 0;

        List<Integer> primeNumbers = new ArrayList<>();

        while (counter < 10) {

            for (int i = input + 1; i < Integer.MAX_VALUE; i++) {

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        counterFinderPrimes++;
                    }
                    if (counterFinderPrimes > 1) {
                        break;
                    }
                }
                if (counterFinderPrimes == 0) {
                    primeNumbers.add(i);
                    counter++;
                }
                if (counter == 10) {
                    break;
                }
                counterFinderPrimes = 0;
            }
        }
        System.out.println(primeNumbers);
    }
}
