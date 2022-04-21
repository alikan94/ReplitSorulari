package replit_ENG_List;

import java.util.ArrayList;
import java.util.List;

public class Eng_List_06 {
    public static void main(String[] args) {
        /*
        Write a program to find the common elements between two String Arrays (without case sensitivity)
        Input1 : {John,Brad,Ange,Sofia,Emily}
        Input2 : {sofia,brad,grace,emily,hazel}
        Output : [sofia,brad,emily]
         */

        String[] input1 = {"John", "Brad", "Ange", "Sofia", "Emily"};
        String[] input2 = {"sofia", "brad", "grace", "emily", "hazel"};
        List<String> commonList = new ArrayList<>();

        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {

                if (!commonList.contains(input1[i])) {
                    if (input1[i].toLowerCase().equals(input2[j].toLowerCase())) {
                        commonList.add(input1[i]);
                    }
                }
            }
        }

        System.out.println(commonList);
    }
}
