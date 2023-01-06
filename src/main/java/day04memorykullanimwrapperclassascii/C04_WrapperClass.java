package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {


    /*
    Non - Primitive Data turleri sadece data barindirmak icin
    degil ayni zamanda methodlarda bulundurur
    Primitive Data turleri ise sadece deger saklar.
    Java bu duruma bir cozum uretmistir.
    Her primitive data turunu Non- Primitive olarak
    kullanabilmek icin ozel Class'lar olusturmustur.
    Oracle firmasinin urunu olan Java primitivelere method
    ekleyerek olusturduklar bu yeni yapiya Wrapper
    Class adini vermistir.

        Primitive             Wrapper
          byte     ==>        Byte
          short    ==>        Short
          int      ==>        Integer *****
          long     ==>        Long
          float    ==>        Float
          double   ==>        Double
          boolean  ==>        Boolean
          char     ==>        Character  *****

    */
/*


 */


    public static void main(String[] args) {

        byte normaltip=12;
        Byte wrappertip=12;

        System.out.println(wrappertip);
        System.out.println(wrappertip.MAX_VALUE);
        System.out.println(wrappertip.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        float f1=13.99F;
        Float ozelf1=f1;

        Character c1='s';
        char primc1=c1;

        String st1="12";
        String st2="6";

        int toplam=Integer.valueOf(st1)+Integer.valueOf(st2);
        System.out.println(toplam);

    }
}
