package ders050123;

import java.util.ArrayList;
import java.util.List;

public class example6
{
    public static void main(String[] args)
    {
        List<String> harfler= new ArrayList<>();
        System.out.println(harfler);
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");
        System.out.println(harfler);
        listElemanlariniDegistir(harfler);
        System.out.println("Main icinde methoddan sonra harfler " + harfler);// [R, B, C, D]
        //Listemizde icindeki elemanlardan bir yada birkacini degistirdigimizde
        //Listeyi degistirmis olmuyoruz.Pass By Value Array ve Listlerde de aynen gecerlidir.
        //Ama listenin kendisini degistirmis olmuyoruz

        listDegistir(harfler);
        System.out.println(" main icinde methoddan sonra harfler = " + harfler); //[R, B, C, D]



    }//main

    private static void listDegistir(List<String> harfler2)
    {

        harfler2= new ArrayList<>();
        System.out.println("Methodda yeni List harfler = " + harfler2);//= []
    }

    private static void listElemanlariniDegistir(List<String> harfler2)
    {
        harfler2.set(0,"R");
        System.out.println(" method icindeki harfler = " + harfler2);//[R, B, C, D]


    }//method

}
