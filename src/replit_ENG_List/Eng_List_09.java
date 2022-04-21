package replit_ENG_List;

import java.util.*;

public class Eng_List_09 {
    public static void main(String[] args) {
        // Write a Java program to get a String from user as input
        // and find the maximum occurring character in that string.(Ignore case sensitivity).
        //
        //Input : Learning java is easy
        //
        //Output: maximum occurring character is : a
        System.out.println("Please enter a sentence : ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();

        String[] arr = input.replaceAll("\\W", "").split("");
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        String maxOccur = "";
        int maxOccurNumber = 0;
        int counter = 1;
        Collections.sort(list);
        System.out.println(list);
        System.out.println(counter);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).equals(list.get(i))) {
                counter++;
                if (maxOccurNumber < counter) {
                    maxOccurNumber = counter;
                    maxOccur = list.get(i - 1);
                }
            } else {
                counter = 0;
            }
        }
        System.out.println("maximum occurring character is : " + maxOccur);
        System.out.println(maxOccur + " is occurring " + maxOccurNumber + " times.");
    }
}
