package practiceDTNT;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        Scanner gun=new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz");
        String g=gun.next();

        if (g.equalsIgnoreCase("cuma")==true) System.out.println("müslümanların kutsal günü");
        if (g.equalsIgnoreCase("cumartesi")==true) System.out.println("yahudilerin kutsal günü");
        if (g.equalsIgnoreCase("pazar")==true) System.out.println("hristyanlar kutsal günü");


    }


}
