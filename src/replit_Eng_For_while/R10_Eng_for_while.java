package replit_Eng_For_while;

public class R10_Eng_for_while {
    public static void main(String[] args) {
        /*
        Write a Program to find the sum of natural numbers from 1 to 100.

        OUTPUT : Sum of Natural Numbers 5050
         */

        int sum =0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        System.out.println("Sum of Natural Numbers " + sum);
    }
}
