package co.za.javers.diff;

import java.io.Console;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class TestInteger {

    private final int a;
    private final int b;

    public TestInteger(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public long sum(){
        return a+b;
    }

    public static void main(String[] args) {
        Integer x=3;
        Integer y=null;
        try{
            System.out.println(Integer.compareUnsigned(x,3)==0 || Integer.compareUnsigned(y,0)==0);
        }
        catch (Exception e){
            System.out.println(e.getClass().toString());
        }

       //y=~x;

        try{
            System.out.println(y.compareTo(null)==0||true);
        }
        catch (Exception e){
            System.out.println(e.getClass().toString());
        }
    }


    public static void main1(String[] args) {
        Console console = System.console();
        System.out.println(console);
    }
}
