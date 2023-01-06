package ders050123;

import java.util.Arrays;

public class example4
{
    public static void main(String[] args)
    {
        int sayilar[]={3,4,5,6};
        elemanDegistir(sayilar);
        System.out.println(" main icinde Eleman degisince sayilar[] = " + Arrays.toString(sayilar));
        // main icinde Eleman degisince sayilar[] = [10, 4, 5, 6]

        arrayiDegistir(sayilar);
        System.out.println("main icindeki arrayi degistir " + Arrays.toString(sayilar));//[10, 4, 5, 6]

    }//main

    private static void arrayiDegistir(int[] sayilar2) {
        sayilar2= new int[6];
        System.out.println("method icinde arrayidegistir = " + Arrays.toString(sayilar2));//[0, 0, 0, 0, 0, 0]

    }

    private static void elemanDegistir(int[] sayilar2) {
        sayilar2[0] =10;
        System.out.println(" method icinde Eleman degisince sayilar[] = " + Arrays.toString(sayilar2));
        // [10, 4, 5, 6]
    }


}
