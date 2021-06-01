package co.za.javers.diff;

import java.time.LocalDate;
import java.time.Year;
import java.util.GregorianCalendar;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class LeapYearTest {
    public static void main(String[] args) {
        System.out.println("new GregorianCalendar().isLeapYear(2020) = " + new GregorianCalendar().isLeapYear(2021));

        System.out.println("args = " + Year.isLeap(2020));

//        LocalDate.of(2020);

    }
}
