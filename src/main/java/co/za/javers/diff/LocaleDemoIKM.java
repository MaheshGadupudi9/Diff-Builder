package co.za.javers.diff;

import java.util.Locale;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class LocaleDemoIKM {
    public static void main(String[] args) {
        Locale usa = new Locale("USA");
        System.out.println(usa.getCountry());
    }
}
