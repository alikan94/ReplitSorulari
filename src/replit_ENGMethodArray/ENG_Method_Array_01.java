package replit_ENGMethodArray;

public class ENG_Method_Array_01 {
    public static void main(String[] args) {
        /*
        Write a return method to reverse number.

Input : 12345

Output : 54321


         */
        int input = 1238;
        int reverseNumber = reverseNumber(input);
        System.out.println("Input : " + input);
        System.out.println("Reverse Of The Number : " +reverseNumber);
    }

    private static int reverseNumber(int input) {
        int reverseInput = 0;

        while (input > 0) {

            reverseInput += (input % 10);
            input /= 10;
            if (input>0){
                reverseInput*=10;
            }
        }
        return reverseInput;
    }
}
