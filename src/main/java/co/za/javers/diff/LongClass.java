package co.za.javers.diff;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Stream;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class LongClass {
    public static void main(String[] args) {
        Long l = new Long(1234);
        Long l1=l;
        if(l==l1) System.out.println("Equal Objects"); else System.out.println("Not Equal Objects"); l++;
        if(l==l1) System.out.println("Equal Objects"); else System.out.println("Not Equal Objects");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add(0,"3");
        strings.add(1,"4");
        strings.forEach(System.out::println);

        System.out.println(Stream.of("green","yellow","blue")
                .max((s1,s2)->s1.compareTo(s2))
                .filter(s->s.endsWith("n"))
                .orElse("yellow"));

        System.out.println("+++++++++");
        Arrays.asList("red","green","blue").stream().map(s->!s.startsWith("b")).forEach(System.out::println);
        Arrays.asList("red","green","blue").stream().filter(s->!s.startsWith("b")).forEach(System.out::println);
       // Arrays.asList("red","green","blue").stream().reduce((s1,s2)->s2.equals("blue")?s1:s2).forEach(System.out::println);
        System.out.println("+++++++++");
    }

    public static void main3(String[] args) {

        Date dateToUse=new Date();

        System.out.println(convertDateToString(dateToUse));
        }

    public static String convertDateToString(Date date) {
        SimpleDateFormat changeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return changeFormat.format(date);
    }
}
