package replit_Eng_For_while;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R03_Eng_for_while {
    public static void main(String[] args) {

        /*

        Write a code that returns the duplicate chars in a String array.(interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]

         */

        String str = "Javaisalsoeasy";
        int counter;
        String[] arr = str.split("");
        List<String> duplicatedCharsList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            counter = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (arr[i].equals(arr[j]) && !arr[i].equals(" ")) {
                    counter++;
                }
            }
            if (counter > 1 && !duplicatedCharsList.contains(arr[i])) {
                duplicatedCharsList.add(arr[i]);
            }
        }

        String[] duplicatedChars = new String[duplicatedCharsList.size()];
        duplicatedCharsList.toArray(duplicatedChars);

        System.out.println("String = " + str);
        System.out.println("Duplicate chars = " + Arrays.toString(duplicatedChars));

    }
}
