package day07ifstatement;

public class C03_serbest_mkdt {
public static int xx;
    public static void main(String[] args) {

        String s1="$13.99",s2="$10.55";

         s1=s1.replaceAll("[$]","");
        s2=s2.replaceAll("[$]","");
        System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));

    }
}
