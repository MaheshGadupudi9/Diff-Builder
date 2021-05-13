package co.za.javers.diff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class PhoneNUmberValidator {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher("2055550125");
        System.out.println("matcher.matches() = " + matcher.matches());

        pattern = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");
        matcher = pattern.matcher("+111 (202) 555-0125");
        System.out.println("matcher.matches() = " + matcher.matches());
        matcher = pattern.matcher("11 (202) 555-0125");
        System.out.println("matcher.matches() = " + matcher.matches());
        matcher = pattern.matcher("+91 test");
        System.out.println("matcher.matches() = " + matcher.matches());
    }
}
