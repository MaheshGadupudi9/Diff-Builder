package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class A10IKMTest {
    static int total = 10;
    public void call(){
        int total=5;
        System.out.println(this.total);
    }

    public static void main(String[] args) {
        A10IKMTest test=new A10IKMTest();
        test.call();
    }
}
