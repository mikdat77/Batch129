package day03dtscan;

public class Runner {

    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.fiyat=11111;
        myCar.dur();
        myCar.model="corolla";
        myCar.hareket();

        Student ogrenci=new Student();
        ogrenci.çalışma();
        ogrenci.beslenme();
        ogrenci.name="tom hanks";
        ogrenci.adres="ankara";

        System.out.println(ogrenci.name);

    }
}
