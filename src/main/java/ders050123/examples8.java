package ders050123;

public class examples8
{
    public static void main(String[] args)
    {
            int fiyat=100;
        System.out.println("metod içi"+indirim10(fiyat));
        System.out.println("metod içi"+indirim20(fiyat));
        System.out.println("metod içi"+indirim25(fiyat));
        System.out.println("metod sonrası"+fiyat);
    }

    public static int indirim10(int fiyat2)
    {
        fiyat2*=0.9;
        return fiyat2;
    }
    public static int indirim20(int fiyat2)
    {
        fiyat2*=0.8;
        return fiyat2;
    }
    public static int indirim25(int fiyat2)
    {
        fiyat2*=0.75;
        return fiyat2;
    }
}
