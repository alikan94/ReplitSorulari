package replit_ENGMethodArray;

import java.util.Arrays;

public class ENG_Method_Array_08 {
    public static void main(String[] args) {
        /*
        Write a return method that accepts 2 integer Arrays as parameters
        And adds 2 array into a new Array and prints it.

        Input1={1,2,3,4}

        Input2={5,6}

        Output={1,2,3,4,5,6}
         */

        int[] input1 = {1,2,3,4};
        int[] input2 = {5,6};
        System.out.println("input1 = " + Arrays.toString(input1));
        System.out.println("input2 = " + Arrays.toString(input2));


        addTwoArrayAndPrint(input1,input2);

    }

    private static void addTwoArrayAndPrint(int[] input1, int[] input2) {
        int[] arr = new int[input1.length+input2.length];

        for (int i = 0; i < input1.length; i++) { // [1,2,3,4,0,0]
            arr[i]=input1[i];
        }
        for (int i = 0; i < input2.length; i++) {
            arr[input1.length+i]=input2[i];
        }

        System.out.println("input1 + input2 = " + Arrays.toString(arr));
    }
}
