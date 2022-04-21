package replit_ENGMethodArray;

public class ENG_Method_Array_03 {
    public static void main(String[] args) {
        /*
        Write a method which accepts a String as parameter and prints the
        sum of the digits, present in the given string.

        input : ade1r4d3

        output : 8
         */

        String str = "ade1r4d3";
        sumOfDigits(str);

    }

    private static void sumOfDigits(String str) {

        int sum =0;
        String numbers = "0123456789";

        for (int i = 0; i < str.length(); i++) {
            if (numbers.contains(str.substring(i,i+1))){ // substring(0,1)

                sum+=Integer.parseInt(str.substring(i,i+1));

            }
        }

        System.out.println(sum);
    }
}
