package replit_TR_SYSO;

public class TR_SYSO_1 {
    public static void main(String[] args) {
        /*
        Ilk satira Hello ikinci satira World! yazdiran praogramin java kodunu yaziniz.

        Ornek Cikti: Hello World!
         */
        System.out.println("Hello");
        System.out.println("World");

        System.out.println("-------------------------------------------");
        /*
        Iki integer'i toplayan java programini yaziniz.
        int a=10
        int b=14
        Ornek Cikti:
        Sayilarin Toplami : 24
         */

        int a = 10;
        int b = 14;

        System.out.println("1. sayi = " + a);
        System.out.println("2. sayi = " + b);

        System.out.println("sayilarin toplami = " + (a + b));

        System.out.println("-------------------------------------------");

        /*
        Verilen integer sayilarin Toplamini, carpimini, cikarma islemini ve bolme islemini yapan java kodunu yaziniz.
        num1=100;
        num2=25;
        Ornek Cikti:
        125
        2500
        75
        4
         */

        int num1 = 100;
        int num2 = 25;

        System.out.println("1. sayi = " + num1);
        System.out.println("2. sayi = " + num2);
        System.out.println("toplam = " + (num1 + num2));
        System.out.println("carpim = " + (num1 * num2));
        System.out.println("fark = " + (num1 - num2));
        System.out.println("bolum = " + (num1 / num2));

        System.out.println("-------------------------------------------");

        /*
        Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.

        r=7;
        Pi=3.14
        Ipucu:
        Dairenin Cevresi : 2Pir
        Dairenin Alani : Pirr
        Ornek Cikti:
        43.96
        153.86
         */

        int r = 7;
        double daireninAlani = 2 * r * (3.14);
        double daireninCevresi = r * r * (3.14);
        System.out.println("Yaricap = " + r);
        System.out.println("Daire alani = " + daireninAlani);
        System.out.println("Dairenin cevresi = " + daireninCevresi);

        System.out.println("-------------------------------------------");
        /*
        Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.
        A=5
        B=3
        Ipucu: Dikdortgenin Cevresi : 2*(A+B);
        Dikdortgenin Alani : A * B ;
        Ornek Cikti:
        Dikdortgenin Cevresi : 16
        Dikdortgenin Alani : 15
         */

        int A = 5;
        int B = 3;

        System.out.println("Dikdortgenin alani = " + (A * B));
        System.out.println("Dikdortgenin cevresi = " + 2 * (A + B));
        System.out.println("-------------------------------------------");


        /*
        Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.

        Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50
        Ornek Cikti:
        Sayilarin Ortalamasi : 30
         */
        int sayi1 = 22;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 28;
        int sayi5 = 50;
        System.out.println("sayilarin ortalamasi : " + (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5);
        System.out.println("-------------------------------------------");


        /*
        Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

        int a= 3;
        int b= 5;
        Ornek Cikti:
        a=5
        b=3
         */
        int numberA=3;
        int numberB=5;
        System.out.println("A = " + numberA);
        System.out.println("B = " + numberB);

        numberA=numberA+numberB;
        numberB=numberA-numberB;
        numberA=numberA-numberB;
        System.out.println("--YERLERI DEGISTI--");
        System.out.println("A = " + numberA);
        System.out.println("B = " + numberB);

    }
}
