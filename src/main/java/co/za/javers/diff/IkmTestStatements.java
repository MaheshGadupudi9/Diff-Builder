package co.za.javers.diff;

import java.util.stream.Stream;

public class IkmTestStatements {
    public static void main(String[] args) {
        String e ="1";
        boolean b= false;
        Double d =null;
        int a =0;
        int c =0;

        System.out.println(("1"!=e)?"true":"false");
        System.out.println((b=true)?"true":"false");
        System.out.println((d instanceof  Double)?"true":"false");
        System.out.println((~a ==0)?"true":"false");
        System.out.println((0==++c)?"true":"false");
    }
}
