package replit_ENG_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Eng_List_07 {
    public static void main(String[] args) {
        /*
        write a Java program to removes a specific element from an array
        and put the remaining elements in a new array and prints the new array

        Input :{1,2,3,4,5,6}

        element:6

        Output : [1,2,3,4,5]

         */

        Scanner scan = new Scanner(System.in);

        int[] input = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(input));
        System.out.println("Enter the number you want to remove :");
        int removedNumber = scan.nextInt();

        Arrays.sort(input);
        List<Integer> list = new ArrayList<>();
        int[] outputArr;

        if (Arrays.binarySearch(input, removedNumber) >= 0) {
            for (int each : input
            ) {
                if (each != removedNumber) {
                    list.add(each);
                }
            }
            outputArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                outputArr[i] = list.get(i);
            }
            System.out.println(Arrays.toString(outputArr));
        } else {
            System.out.println("Array does not contain that number.");
        }


    }
}
