package replit_ENGMethodArray;

public class ENG_Method_Array_07 {
    /*
    Write a method that accepts an array as parameter
    and returns sum off all elements in the array Then print the result in the main method.

    Eg :

    input : {1,2,3,4,5,6,7,8};

    output: 36
     */

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};

        int sum = sumOfAll(input);
        System.out.println(sum);
    }

    private static int sumOfAll(int[] input) {
        int sum = 0;

        for (int each : input
        ) {
            sum += each;
        }

        return sum;
    }

}
