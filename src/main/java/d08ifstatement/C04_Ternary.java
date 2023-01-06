package d08ifstatement;

import java.util.Scanner;

public class C04_Ternary {

    public static void main(String[] args) {

        Scanner veri=new Scanner(System.in);
//example 1: iki sayının karşılaştırılması
        int sa1=veri.nextInt();
        int sa2=veri.nextInt();

        System.out.println(sa2==sa1 ? "Sayılar eşit" : sa2<sa1
                ? "2.sayı="+sa2+" 1.sayı="+sa1+" dan küçüktür"
                : "2.sayı="+sa2+" 1.sayı="+sa1+" dan buyuktur" );
     /*   if (sa2<sa1) System.out.println("2.sayı="+sa2+" 1.sayı="+sa1+" den kucuktur");
        else if (sa2>sa1) System.out.println("2.sayı="+sa2+" 1.sayı="+sa1+" den buyuktur");
        else System.out.println("sayılar eşit");*/

        //example 2: bir sayı al pozitif mi negatif mi
String sonuc=sa1==0 ? "sayı 0" : "sayı 0 dan farklı";
        System.out.println(sa1<0 ? "sayı negatif" :sa1==0 ? "sayı 0" : "sayı poziti");
        System.out.println("int"+sonuc);
    }
}
