package co.za.javers.diff.sets;

import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale locale= Locale.US;
        System.out.println("Country() = " + locale.getCountry());
        System.out.println("FN" + locale.getDisplayCountry());
        System.out.println("Language() = " + locale.getLanguage());
        System.out.println("Full Language" + locale.getDisplayLanguage());
    }
}
