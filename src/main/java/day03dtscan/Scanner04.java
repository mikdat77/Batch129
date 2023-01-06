package day03dtscan;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        Scanner sayiler=new Scanner(System.in);

        System.out.println("1.sayıyı girin");
        double sayi1=sayiler.nextDouble();
        System.out.println("2.sayıyı girin");
        double sayi2=sayiler.nextDouble();

        System.out.println("iki sayının toplamı="+(sayi1+sayi2));
        System.out.println("iki sayının çarpımı="+(sayi1*sayi2));
        System.out.println("iki sayının bölümü="+(sayi1/sayi2));
        System.out.println("iki sayının farkı="+(sayi1-sayi2));




    }
}
