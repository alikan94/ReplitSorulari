package replit_ENG_List;

import java.util.Scanner;

public class Eng_List_08 {
    public static void main(String[] args) {
        // Write a java program which accept a sentence as parameter,
        // than reverses sentence by using StringBuilder
        // and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.
        //
        // Input :
        //
        // I love Java.
        //
        // Output:
        //
        // Reversed sentence : avaJ evol I. It is not a palindrome"

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence : ");
        String inputStr = scan.nextLine();
        StringBuilder inputStrBuild = new StringBuilder(inputStr);

        System.out.println(inputStrBuild.reverse());
        if (inputStrBuild.toString().replaceAll("\\W","").toLowerCase().equals(inputStr.replaceAll("\\W","").toLowerCase())){
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }


    }
}
