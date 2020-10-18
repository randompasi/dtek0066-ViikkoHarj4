package Assignment3;


import java.util.*;

public class Main {


    public static void main(String args[]){
        List<HenkilöA> users = new ArrayList<>();
        Random r = new Random();
        for(int j = 0; j<500; j++) {
            int x = 10;
            byte[] array = new byte[x];
            new java.util.Random().nextBytes(array);
            for (int i = 0; i < x; i++) {
                array[i] &= 127;
                array[i] %= 94;
                array[i] += 32;
            }
            String foo = new String(array, java.nio.charset.Charset.forName("UTF-8"));
            HenkilöA h = new HenkilöA(foo, r.nextInt(100));
            users.add(h);
        }



            users.subList(0,19).forEach(x-> System.out.println(x.hashCode()));
        System.out.println("--------------------------------------------------");

        List<HenkilöB> users2 = new ArrayList<>();
        for(int j = 0; j<500; j++) {
            int x = 10;
            byte[] array = new byte[x];
            new java.util.Random().nextBytes(array);
            for (int i = 0; i < x; i++) {
                array[i] &= 127;
                array[i] %= 94;
                array[i] += 32;
            }
            String foo = new String(array, java.nio.charset.Charset.forName("UTF-8"));
            HenkilöB h = new HenkilöB(foo, r.nextInt(100));
            users2.add(h);
        }


        users2.subList(0,19).forEach(x-> System.out.println(x.hashCode()));

        System.out.println("--------------------------------------------------");

        System.out.println( Objects.hash(users));

    }




}
