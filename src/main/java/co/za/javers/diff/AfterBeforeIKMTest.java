package co.za.javers.diff;

public class AfterBeforeIKMTest {
    public static void main(String[] args) {
        int value =25;
        Integer before = value;
        Long after = ++before == 26?5: new Long(10);
        System.out.println(after.intValue()-before.intValue());

    }
}

class AccountS <T extends Number>{

}