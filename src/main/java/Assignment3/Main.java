package Assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class Main {


    public static void main(String args[]){
        Map<Henkilö, Henkilö> users = new HashMap<>();
        Random r = new Random();
        for(int j = 0; j<500; j++){
            int x = 10;
            byte[] array = new byte[x];
            new java.util.Random().nextBytes(array);
            for(int i = 0; i < x; i++) {
                array[i] &= 127;
                array[i] %= 94;
                array[i] += 32; }
            String foo = new String(array, java.nio.charset.Charset.forName("UTF-8"));
            Henkilö h = new Henkilö(foo, r.nextInt(100));





        }




    }
}
