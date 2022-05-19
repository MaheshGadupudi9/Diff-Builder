package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class TestIKM {

    static String str;

    public void TestIKM() {
        System.out.println("I test");
        str="hello world";
    }

    public static void main(String[] args) {
        TestIKM testIKM = new TestIKM();
        System.out.println(str);
    }
}
