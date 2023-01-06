package ders050123;

import java.util.ArrayList;
import java.util.List;

public class examples9
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        list.add(10);list.add(11);list.add(12);
        degistir(list);
        System.out.println("metod sonrası "+list);
        degistir2(list);
        System.out.println("metod sonrası "+list);

    }

        public static void degistir(List <Integer> list)
        {
            for (Integer w: list)
            {
                w+=3;
                System.out.println(w+" ");
            }
            System.out.println("metod içi");
            System.out.println(list);
        }
        public static void degistir2(List<Integer> list)
        {
            for (int i = 0; i < list.size(); i++)
            {
            list.set(i, list.get(i)+3);
                System.out.println(list.get(i)+" ");
            }
            System.out.println("metod içi");
            System.out.println(list);
        }

}
