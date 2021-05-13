package co.za.javers.diff;

import java.util.Formatter;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class FormatTest {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        String snull =null;
        StringBuilder builder = new StringBuilder("C");
        Formatter fmt = new Formatter(builder);

        fmt.format("%s%s",a,b);
        System.out.println("ln1 "+fmt);

        fmt.format("%-2s",b);
        System.out.println("ln2 "+fmt);

        fmt.format("%b",snull);
        System.out.println("ln3 "+fmt);
    }
}
