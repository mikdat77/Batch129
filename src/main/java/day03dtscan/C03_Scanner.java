package day03dtscan;

import java.util.Scanner;

public class C03_Scanner {


    public static void main(String[] args) {

     /*   Scanner verigiris=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayi1=verigiris.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayi2=verigiris.nextInt();
        int toplam=sayi2+sayi1;
        System.out.println("iki sayının toplamı"+toplam);*/

        Scanner kimlik=new Scanner(System.in);
        System.out.println("isim girin");
        String isim=kimlik.next();
        System.out.println("soyisim girin");
        String soyisim=kimlik.next();

        System.out.println("Girdiğiniz isim soyisim="+isim+" "+soyisim);
        System.out.print("adresi gir");
        String adres=kimlik.nextLine();
        System.out.println("adres"+adres);

    }
}
