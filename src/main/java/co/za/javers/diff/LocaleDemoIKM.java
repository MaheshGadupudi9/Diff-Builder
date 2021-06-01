package co.za.javers.diff;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class LocaleDemoIKM {
    public static void main(String[] args) {
/*        Locale usa = new Locale("USA");
        System.out.println(usa.getCountry());*/

        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());

        CDate cDate = new CDate();
        cDate.setDay(instance.get(Calendar.DAY_OF_MONTH));
        cDate.setMonth(instance.get(Calendar.MONTH)+1);
        cDate.setYear(instance.get(Calendar.YEAR));

        System.out.println("cDate = " + cDate);

    }
}


class CDate{
    int year;
    int day;
    int month;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "CDate{" +
                "year=" + year +
                ", day=" + day +
                ", month=" + month +
                '}';
    }
}