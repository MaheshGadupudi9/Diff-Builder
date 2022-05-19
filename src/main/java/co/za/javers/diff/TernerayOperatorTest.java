package co.za.javers.diff;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class TernerayOperatorTest implements I2 {
    public static void main(String[] args) {


        System.out.println(I2.name);
        System.out.println(I2.s1);
        System.out.println(((I1)new TernerayOperatorTest()).name);

        //test b=8
        int b=8;
        int a = b= 2;
        int c= a==b? (a<b ?1:0):-1;
        System.out.println("c = " + c);

        //loclae

        final Locale locale = new Locale("USA");
        System.out.println("country"+locale.getCountry());
    }
}


interface I1{
    String name="N1";
    String s1="S1";
}

interface I2 extends I1{
    String name="N2";
}