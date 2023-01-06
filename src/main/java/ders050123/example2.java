package ders050123;

public class example2 {
    public static void main(String[] args)
    {
        int gomlek=100;

        System.out.println(indirim("ogrenci", gomlek));//90
        System.out.println(indirim("Gazi", gomlek));//80
        System.out.println(indirim("Yaslilar", gomlek));//95
    }//main

    private static int indirim(String durum, int gomlek) {
        switch(durum){
            case "ogrenci":
                gomlek=gomlek-10;
                break;
            case "Gazi":
                gomlek=gomlek-20;
                break;
            case"Yaslilar":
                gomlek=gomlek-5;
            default:
                gomlek=gomlek;
        }
        return gomlek;


    }
}
