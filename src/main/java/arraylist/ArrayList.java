package arraylist;

import java.util.List;
import java.util.Random;

public class ArrayList {
    public static void main(String[] args) {

        List <String> ana=new java.util.ArrayList<>();
        List <String> yedek=new java.util.ArrayList<>();

        ana.add("ahmet");
        ana.add("mehmet");
        ana.add("veli");
        yedek.add("ahmet");
        yedek.add("veli");

        System.out.println(ana.contains("veli"));
        System.out.println(ana.containsAll(yedek));

        Random x=new Random();
        int sayi=x.nextInt(100);
        System.out.println(sayi);

    }
}
