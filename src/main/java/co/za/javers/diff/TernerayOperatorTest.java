package co.za.javers.diff;

import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class TernerayOperatorTest implements I2 {
    public static void main(String[] args) {
        int b=8;
        int a = b= 2;
        int c= a==b? (a<b ?1:0):-1;
        System.out.println("c = " + c);


        System.out.println(I2.name);
        System.out.println(I2.s1);
        System.out.println(((I1)new TernerayOperatorTest()).name);

    }
}


interface I1{
    String name="N1";
    String s1="S1";
}

interface I2 extends I1{
    String name="N2";
}