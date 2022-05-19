package co.za.javers.diff;

public class IkmTestBlock
{
    private static final int count;

    static {
        System.out.println("In Block 1");
        count = 10;
    }
    private int [] data ;

    {
        System.out.println("In Block 2");
        data = new int[count];
        for (int i = 0; i < count; i++) {
            data[i]=i;
        }
    }

    public static void main(String[] args) {
        System.out.println("count = " + count);
        System.out.println("Before first call to new");
        IkmTestBlock test1 = new IkmTestBlock();
        System.out.println("Before second call to new");
        IkmTestBlock test2 = new IkmTestBlock();
    }

}
