package day03dtscan;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        Scanner kenarlar=new Scanner(System.in);

        System.out.println("kenar 1");
        int kenar1=kenarlar.nextInt();
        System.out.println("kenar 2");
        int kenar2=kenarlar.nextInt();

        System.out.println("dikdörtgenin alanı="+(kenar1*kenar2));
        System.out.println("dikdörtgenin çevresi="+2*(kenar1+kenar2));

    }
}
