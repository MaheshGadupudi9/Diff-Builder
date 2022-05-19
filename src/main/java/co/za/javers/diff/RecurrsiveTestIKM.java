package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class RecurrsiveTestIKM {
    public static void main(String[] args) {
        System.out.println("calculateSUm(10,4) = " + calculateSUm(10, 4));
    }

    private static int calculateSUm(int n, int jumpValue) {
        if(n<2)
            return 0;

        if(n==jumpValue) {
            return jumpValue*calculateSUm(jumpValue-1,jumpValue);
        }

        return n+calculateSUm(n-2,jumpValue);
    }


}
