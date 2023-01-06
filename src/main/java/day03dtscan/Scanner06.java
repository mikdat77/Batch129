package day03dtscan;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        Scanner sayi=new Scanner(System.in);
        System.out.println("5 basamaklı bir sayı giriniz=");
        int sayim=sayi.nextInt();
        float ilkiki=sayim/1000;
        System.out.println("ilk iki hane="+ilkiki);
        float soniki=sayim-(sayim/100)*100;
        System.out.println("son iki hane="+soniki);
    }
}
