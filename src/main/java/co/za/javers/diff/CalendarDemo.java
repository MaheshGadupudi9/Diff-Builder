package co.za.javers.diff;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000,Calendar.AUGUST,30);
        calendar.roll(Calendar.MONTH,7);

        System.out.println(calendar.get(Calendar.DATE)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.YEAR));

        calendar.add(Calendar.MONTH,11);
        System.out.println(calendar.get(Calendar.DATE)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.YEAR));

        LocalDate date = LocalDate.of(2000, Month.AUGUST, 30);
        date.plusMonths(6);

        System.out.println(date.getDayOfMonth()+"-"+date.getMonthValue()+"-"+date.getYear());
    }
}
