package replit_ENGMethodArray;

import java.util.Arrays;

public class ENG_Method_Array_04 {
    public static void main(String[] args) {
        /*
        Create a custom return type method accepts a name as parameter and prints the name as a char array.

        (do not use toCharArray() method)

        Input : John

        Output :[J, o, h, n]
         */

        String input = "John";
        char[] arr = returnCharArray(input); //['J','o',h,n]
        System.out.println(input);
        System.out.println(Arrays.toString(arr));


    }

    private static char[] returnCharArray(String input) {

        char[] arr = new char[input.length()];

        for (int i = 0; i < input.length(); i++) { // char arr ['J','o',h,n]
            arr[i]=input.charAt(i);
        }

        return arr;
    }
}
