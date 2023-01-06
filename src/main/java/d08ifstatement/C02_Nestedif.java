package d08ifstatement;

import java.util.Scanner;
import java.util.stream.Stream;

public class C02_Nestedif
{

    public static void main(String[] args)
    {

        Scanner veri = new Scanner(System.in);
        String pwd = veri.next();
        char ch = pwd.charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            if (ch == 'A' || ch == 'z') System.out.println("gecerli");
            else System.out.println("geçersiz");
        } else System.out.println("ılk karakter harf olmalı");
    }
}
