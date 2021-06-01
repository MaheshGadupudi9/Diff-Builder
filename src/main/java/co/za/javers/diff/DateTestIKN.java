package co.za.javers.diff;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class DateTestIKN {
    public static void main(String[] args) {
        Date date;

        try {
            date = new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-15");

            Calendar instance = Calendar.getInstance();
            instance.setTime(date);

            System.out.println(instance.get(Calendar.DAY_OF_MONTH)+" ,"+instance.get(Calendar.MONTH));


            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate parse = LocalDate.parse("2020-01-15", dateTimeFormatter);
            System.out.println(parse.getDayOfMonth() +","+parse.getMonthValue());

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
