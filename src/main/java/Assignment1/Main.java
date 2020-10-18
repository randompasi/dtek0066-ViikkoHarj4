package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Main {




public static void  main(String  args[]){


    tulostaKyltit(luoKyltit());

}

    /**
     * creates Three different signs and returns String list
     * @return List<String>
     */

static List<Sign> luoKyltit(){
    List<Sign> signs = new ArrayList<Sign>();
    signs.add(new Sign(new Dimension(6, 16), new Filling("-"), "First Sign"));
    signs.add(new Sign("Second Sign", true));
    signs.add(new Sign("Third Sign",false));
    Sign a = new Sign("aaa", true);
    //a.ha
    return signs;

}

    /**
     * prints each string that is on list.
     * @param signs
     * @.pre signs != null
     * @.post true
     */
    static void tulostaKyltit(List<Sign> signs){
    signs.forEach(System.out::print);
}








}
