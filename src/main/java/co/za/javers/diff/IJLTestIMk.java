package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class IJLTestIMk {

    public static void main(String[] args) {
        int i=2;
        int j=0;

        j =(i++ + i++) * --i;

        System.out.println("j = " + j);
    }
}
