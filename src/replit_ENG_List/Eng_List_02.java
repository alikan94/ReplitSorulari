package replit_ENG_List;

import java.util.ArrayList;
import java.util.List;

public class Eng_List_02 {
    public static void main(String[] args) {
        /*
        Create a 10-element list. Swap the 8th element with the 3rd element.

        INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        Output:

        [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
         */

        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        List<String> namesList= new ArrayList<>();

        for (String each:names
             ) {
            namesList.add(each);
        }
        System.out.println(namesList);

        namesList.add(2,namesList.get(7));
        namesList.add(8,namesList.get(3));
        namesList.remove(3);
        namesList.remove(8);

        System.out.println(namesList);




    }
}
