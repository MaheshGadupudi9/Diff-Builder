package co.za.javers.diff;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        String a=null;
        Optional<String> b = Optional.empty();

        try {
            System.out.println("A:"+a.length());
            System.out.println("B:"+b.orElse("").length());
        }catch (Exception e){
            System.out.println("exception"+a);
        }

        finally {
            a="String";
            System.out.println(a.length());
            b=Optional.ofNullable("");
            System.out.println(b.get().length());
        }

    }
}
