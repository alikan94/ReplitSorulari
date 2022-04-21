package replit_ENGMethodArray;

import java.util.Arrays;

public class ENG_Method_Array_02 {
    public static void main(String[] args) {
        /*
        Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

        Input : Coding is greate.

        Output : .etaerg si gnidoC
         */

        String input = "Coding is great.";
        reverseSentence(input);
    }

    private static void reverseSentence(String input) {

        String[] arr = input.split("");
        String[] reverseArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reverseArr[arr.length-1-i]=arr[i];
        }
        for (String each : reverseArr) {
            System.out.print(each);
        }

    }

}
