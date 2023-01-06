package ders060123;

public class C04_Static
{
    public static void main(String[] args)
    {

        C03_StaticDepo obj1=new C03_StaticDepo();

        //   System.out.println(C03_StaticDepo.okulIsmi);
       // C03_StaticDepo.okulIsmi="Çandarlı";
      //  System.out.println(C03_StaticDepo.okulIsmi);

        C03_StaticDepo obj2=new C03_StaticDepo();
        obj2.ogrenciGul="hümeyra";
        obj1.ogrenciGul="murat";
        System.out.println(obj1.ogrenciGul);
        System.out.println(obj2.ogrenciGul);
        C03_StaticDepo.


    }
}
