package practiceDTNT;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        //kullanıcıdan alınan iki sayıyı yine kullanıcıdan alınan işlem ile,
        //aritmetik işlemini yap

        Scanner sayılar=new Scanner(System.in);
        Scanner islem=new Scanner(System.in);

        System.out.println("1.sayıyı gir");
        int s1=sayılar.nextInt();
        System.out.println("2.sayıyı gir");
        int s2=sayılar.nextInt();

        System.out.println("toplama için 1");
        System.out.println("çıkarma için 2");
        System.out.println("bölme için 3");
        System.out.println("çarpma için 4");
        System.out.println("seçiminizi yapar mısınız");
        byte secim=islem.nextByte();

        if (secim==1) System.out.println("İki sayının toplamı="+(s1+s2));
        if (secim==2) System.out.println("İki sayının farkı="+(s1-s2));
        if (secim==3) System.out.println("İki sayının çarpımı="+(s1*s2));
        if (secim==4) System.out.println("İki sayının bölümü="+(s1/s2));




    }
}
