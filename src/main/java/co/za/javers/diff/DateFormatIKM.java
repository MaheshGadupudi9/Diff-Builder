package co.za.javers.diff;

import org.joda.time.LocalDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatIKM {
    public static void main(String[] args) {
        //System.out.println(new LocalDate().format);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        System.out.println(DateFormat.getDateInstance().toString());
        System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));
        //System.out.println(LocalDate.now().for);

    }
}
