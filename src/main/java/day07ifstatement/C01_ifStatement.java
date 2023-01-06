package day07ifstatement;

import java.util.Scanner;

public class C01_ifStatement {

    public static void main(String[] args) {

        Scanner Veri=new Scanner(System.in);
String depo="";
        String verim=Veri.next();
        if (verim.contains("a")) System.out.println("girdiğinizde a var");
        else if (verim.contains("Z")) System.out.println("girdiğinizde a var");
        else System.out.println("hiç biri yopk");
        if (verim.length()>4) System.out.println("4 karakterden büyük kelime girdiniz");
       for (int say=verim.length()-1;say>-1;say--)
       {
           depo=depo+verim.charAt(say);
       }
        System.out.println(depo);


    }

}
