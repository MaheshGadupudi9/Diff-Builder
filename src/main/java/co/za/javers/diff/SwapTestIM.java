package co.za.javers.diff;

import java.lang.reflect.Array;
import java.util.*;


/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class SwapTestIM {

    public static void main(String[] args) {
        String[] strings={"dog","cat","mouse","cat"};

        Set<String> set = getSet(strings);

        set.forEach(s-> System.out.print(s));

        System.out.println();


    }

    private static Set<String> getSet(String[] strings) {

        int arg1=0;
        int arg2=1;
        Collections.swap(Arrays.asList(strings),arg1,arg2);

        Array.set(strings,1," Comes after the ");
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        Collections.addAll(hashSet,strings);

                return hashSet;
    }

}
