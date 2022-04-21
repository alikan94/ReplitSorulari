package replit_ENG_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eng_List_03 {
    public static void main(String[] args) {
        /*
        Get a sentence from the user. Accept the sentence received from the user as a parameter,
        Invert sentence using Array and write a Method that returns the result as a String to the main method.
        Note : Upper and lower case letters, spaces and special characters will not be changed.
        Input :
        It is very nice to write code.
        Output :
        .edoc etirw ot ecin yrev si tI
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence : " );
        String input = scan.nextLine();

        String[] arr = input.split("");
        List<String> reversedInputList = new ArrayList<>();

        for (int i = arr.length-1; i >=0; i--) {
            reversedInputList.add(arr[i]);
        }
        String reversedInput = "";
        for (String each:reversedInputList
             ) {
            reversedInput+=each;
        }
        System.out.println(input);
        System.out.println(reversedInput);




    }
}
