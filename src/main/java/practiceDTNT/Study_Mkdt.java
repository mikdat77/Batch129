package practiceDTNT;

import java.util.Scanner;

public class Study_Mkdt {
    public static void main(String[] args) {

      Scanner veri=new Scanner(System.in);
/*
        char ch=veri.next().charAt(0);

        String durum=(ch>=97 && ch<=122) ? "harf küçük" : (ch>=65 && ch<=90) ? "harf büyük" : "harf değil";

        System.out.println(durum);*/

            String cumle=veri.nextLine();
            String kelime=veri.nextLine();
        int sonuc1=cumle.indexOf(kelime);
            int sonuc2=cumle.lastIndexOf(kelime);
        if (sonuc2==sonuc1 && sonuc2!=-1) System.out.println("bir defa kullanılmış");
        if (sonuc2==-1 && sonuc1==-1) System.out.println("kullanılmamış");
        if (sonuc2!=sonuc1) System.out.println("1 edn fazla kullanılmıi");

    }
}
