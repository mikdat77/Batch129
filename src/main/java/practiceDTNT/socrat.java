package practiceDTNT;

import java.util.Scanner;

public class socrat {
    public static void main(String[] args) {

        Scanner veri=new Scanner(System.in);

        System.out.println("kaç satırlı üçgen");
        int satır=veri.nextInt();

        int kenar1=satır*2;

    for (int j=0;j<satır;j++)
    { int i=1;
        for (i = 1; i <kenar1 ; i++) {
            System.out.print(" ");
        }
        System.out.print("*");


        for (int x =i; x>0 ; x--) {
            System.out.print(" ");

        }
     kenar1--;
        System.out.println("*");



        }
    }}

