package co.za.javers.diff;

import java.io.Console;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
class MyPredicate<T> implements Predicate<T>{

   Predicate<T> local;

    public MyPredicate(Predicate<T> local) {
        this.local = local;
    }

    @Override
    public boolean test(T t) {
        return local.test(t);
    }
}
public class Predicator {
    static  boolean testit(Object s,Predicate<Object> p){
        return p.test(s);
    }

    public static void main(String[] args) {
        final String s1="HI";
        final Integer i1=3;
        final int x=1;
        MyPredicate[] p = new MyPredicate[4];
        p[0]=new MyPredicate(e->e.equals(s1));
        p[1]=new MyPredicate(e-> {if (x==1) return e.equals(s1);return !e.equals(s1);});
        p[2]=new MyPredicate(e-> {if (x!=1) return e.equals(i1);return !e.equals(s1);});
        p[3]=new MyPredicate((Object e)-> {if (x!=1) return e.equals(i1);return !e.equals(s1);});
        for (MyPredicate<Object> myPredicate : p) {
            System.out.println(testit(s1,myPredicate));
        }
        Console console = System.console();
        System.out.println("console = " + console);
    }
}
