package replit_ENGMethodArray;

public class ENG_Method_Array_05 {
    public static void main(String[] args) {
        /*
        Write a java program that calculates the average value of array elements

        input[]= {1,2,3,4,5,6,7}

        Output : 4
         */

        int input[] = {1, 2, 3, 4, 5, 6, 7};
        avaregeValue(input);

    }

    private static void avaregeValue(int[] input) {
        double sum = 0;
//        for (int each : input) {
//            sum += each;
//        }

        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }

        double averageValue = sum / input.length;
        System.out.println("average value of array elements = " + averageValue);

    }
}
