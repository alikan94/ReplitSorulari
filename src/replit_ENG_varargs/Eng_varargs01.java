package replit_ENG_varargs;

public class Eng_varargs01 {
    public static void main(String[] args) {
        // Write a return method that accepts more than one integer as parameter
        // and prints the sum of integers Method name = sum if you call
        // method like that sum(1,2,3) output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3

        int sum = sumOf(2,3,4,5,6,7,8,9);
        System.out.println(sum);

    }

    private static int sumOf(int... numbers) {
        int sum=0;

        for (int each:numbers
             ) {
            sum+=each;
        }

        return sum;

    }
}
