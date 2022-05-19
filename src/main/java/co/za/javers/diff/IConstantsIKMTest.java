package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class IConstantsIKMTest {

    public static void main(String[] args) {
        System.out.println(A.B.c);
        System.out.println(A.D);
    }
}

interface A{
    interface B{
        public static final int c=1;
    }
        public static final int D=2;
}
