package co.za.javers.diff;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        String a=null;
        Optional<String> b = Optional.empty();

        try {
            System.out.println(a.length());
            System.out.println(b.orElse("").length());
        }catch (Exception e){
            System.out.println(a);
        }

        finally {
            a="String";
            System.out.println(a.length());
            b=Optional.ofNullable("");
            System.out.println(b.get().length());
        }

    }
}
