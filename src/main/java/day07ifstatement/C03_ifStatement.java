package day07ifstatement;

import java.util.Scanner;

public class C03_ifStatement {
    public static void main(String[] args) {

        System.out.println("haftanın günlerinden birini gir");
        Scanner gun=new Scanner(System.in);
        String gun1=gun.next();

        if (gun1.equalsIgnoreCase("Cumartesi")  || gun1.equalsIgnoreCase("pazar") )
            System.out.println("hafta sonu girdiniz");
        else if (gun1.equalsIgnoreCase("pazartesi") || gun1.equalsIgnoreCase("sali"))
            System.out.println("hafta ici");
        else System.out.println("gecerli girin");

         {

        }
    }
}
