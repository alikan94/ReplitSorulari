package replit_ENG_List;

import java.util.ArrayList;
import java.util.List;

public class Eng_List_04 {
    public static void main(String[] args) {
        //  Write a program that deletes the letters 'a' from the names in the list given as input.
        //
        //INPUT :
        //     list1={"Ali","Veli","Ayse","Fatma","Omer"}
        //
        //     OUTPUT :
        //
        //     [Veli,Omer]

        List<String> nameList = new ArrayList<>();
        String[] arr = {"Ali","Veli","Ayse","Fatma","Omer"};
        for (String each:arr
             ) {
            nameList.add(each);
        }
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].toLowerCase().contains("a")){
                newList.add(arr[i]);
            }
        }
        System.out.println(newList);

    }
}
