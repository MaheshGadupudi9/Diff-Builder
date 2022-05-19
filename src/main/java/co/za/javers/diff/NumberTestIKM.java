package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class NumberTestIKM {
    public static void main(String[] args) {
        int b = 8;
        int a= b= 2;

        int c= a ==b? (a<b?1:0):-1;
        System.out.println("c = " + c);
    }
}
