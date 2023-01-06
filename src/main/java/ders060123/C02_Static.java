package ders060123;

import day07ifstatement.C03_serbest_mkdt;

public class C02_Static
{
    static int sayi1=10;
    int sayi2;
    public static void main(String[] args)
    {

        System.out.println("sayi1"+sayi1);
        C02_Static obj1=new C02_Static();
        System.out.println(obj1.sayi2);
        C02_Static obj2=new C02_Static();
        System.out.println();
        obj1.sayi1=sayi1+2;
        obj2.sayi1=sayi1+3;

        System.out.println(obj1.sayi1);
        System.out.println(obj2.sayi1);


    }
}
