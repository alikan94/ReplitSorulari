package replit_ENGMethodArray;

import java.util.Arrays;

public class ENG_Method_Array_06 {
    public static void main(String[] args) {
        /*
        Write a method that accepts an integer array as input
        and prints the minimum and the maximum numbers from given array

        Input : {3,2,5,4,1,6}

        Output :

        min: 1

        max: 6
         */

        int[] input = {3, 2, 5, 4, 1, 6};
        printMinAndMaxNumbers(input);


    }

    private static void printMinAndMaxNumbers(int[] input) {
        Arrays.sort(input);
        System.out.println("min : " + input[0]);
        System.out.println("max : " + input[input.length-1]);
    }
}
