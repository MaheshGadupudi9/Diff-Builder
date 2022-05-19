package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class IKMChildParentTest extends Parent {
    public IKMChildParentTest() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("count" + getCount());
        IKMChildParentTest test = new IKMChildParentTest();
        System.out.println("count" + getCount());

    }
}


class Parent{
    protected static int count=0;

    public Parent() {
        count++;
    }
    static int getCount(){return count;}
}