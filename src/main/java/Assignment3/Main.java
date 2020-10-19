package Assignment3;


import java.util.*;

public class Main {
    /**
     * most efficien could be custom hash code but that is problem,
     * because it's most easiest to get error or collisions if nopt done right.
     * Cannot say for default hascode and object.hash valueas are too close.
     * @param args
     */

    public static void main(String args[]){

        int y = 20;
        int[] taulu = new int[y];

        System.out.println();
        Map<Integer,HenkilöA> users = new HashMap<>();
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

                taulu[h.hashCode()%taulu.length]+= 1;

        }
        for(int i = 0; i < y; i++) System.out.print(taulu[i] + " ");




        System.out.println("\n--------------------------------------------------");
        int[]  taulu2 = new int[y];
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

            taulu2[Math.abs(h.hashCode()%taulu2.length)]+= 1;

        }
        for(int i = 0; i < y; i++) System.out.print(taulu2[i] + " ");


        System.out.println("\n--------------------------------------------------");
        int[]  taulu3 = new int[y];
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
            taulu3[Objects.hash(h)%taulu3.length]+= 1;
        }

        for(int i = 0; i < y; i++) System.out.print(taulu3[i] + " ");

    }




}
