package replit_Eng_For_while;

public class R05_Eng_for_while {
    public static void main(String[] args) {
        /*
            Print even numbers from 20 to 0 but do not use decrement (i--).

            OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
         */

        int number = 20;
        int counter = 0;
        String output = "";

        while (counter <= number) {

            if (counter % 2 == 0) {
                output += number - counter + " ";
            }
            counter++;
        }
        System.out.println("Even Numbers from " + number + " to 0 are: " + output);
    }
}
