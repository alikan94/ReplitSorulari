package replit_ENG_constructors;

public class Eng_constructors03 {



    public static void main(String[] args) {
        //Create 2 constructors one is with parameters, the other one is without parameter.
        // By using that constructors create at least 2 objects then print their features on the console.

        Eng_constructors03 obj1 = new Eng_constructors03();
        Eng_constructors03 obj2 = new Eng_constructors03(8);

    }

    Eng_constructors03(){
        System.out.println("constructor without parameter");
    }
    Eng_constructors03(int number){
        System.out.println("constructor with parameter");
    }
}
