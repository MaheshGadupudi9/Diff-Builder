package co.za.javers.diff;

import co.za.javers.diff.dto.Gender;
import co.za.javers.diff.dto.Person;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.javers.core.diff.changetype.ValueChange;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootApplication
public class JDiffBuilderApplication {

	public static void main(String[] args) {
		final Set<String> set = new HashSet<>();
		set.add("text");
		set.add("text");
		set.add("text");
		set.add("name");
		set.add("name");
		set.add("name2");
		set.add("hello");
		System.out.println("set = " + set);
		StringBuilder MISSING_DATA= new StringBuilder();
		for (String s : set) {
			MISSING_DATA.append(s);
		}
		System.out.println("MISSING_DATA = " + MISSING_DATA.toString());
	}

	public static void mainDateTest(String[] args) throws ParseException {
		final ArrayList<Date> dates = new ArrayList<>();
		dates.add(new Date());
		SimpleDateFormat SDFormat = new SimpleDateFormat("MM/ dd/ yyyy");
		Calendar cal = Calendar.getInstance();
		String dt = "10/ 27/ 2016";
		cal.setTime(SDFormat.parse(dt));
		dates.add(cal.getTime());
		dt="11/ 02/ 2013";
		cal.setTime(SDFormat.parse(dt));
		dates.add(cal.getTime());
		final Date fromList = findOldestDateFromList(dates);
		System.out.println(fromList);
	}

	public static void mainTest(String[] args) {
//		SpringApplication.run(JDiffBuilderApplication.class, args);
//		test();
		String s =null;
		 String oldVal = String.valueOf(s); // "" null
		 String newVal = String.valueOf(""); // null ""
		System.out.println("oldVal = " + oldVal);
		System.out.println("newVal = " + newVal);
		if(oldVal.equalsIgnoreCase("null")){
			oldVal=null;
		}

		if(isBlank(oldVal) && isBlank(newVal)){
			System.out.println("PRINTED FALSE");
		}
		else	System.out.println("PRINTED TRUE");

	}

	public static void test(){
		Javers javers =  JaversBuilder.javers().build();

		Person savedPerson = new Person(1, "Michael Program", new Gender(1,"MALE"));
		Person unsavedPerson = new Person(1, "Michael Java", new Gender(2,"FEMALE"));
		Diff diff = javers.compare(savedPerson, unsavedPerson);
		if(diff.hasChanges()){
			for (ValueChange valueChange :diff.getChangesByType(ValueChange.class)) {
				System.out.println(valueChange);
				Object left = valueChange.getLeft();
				Object right = valueChange.getRight();
				System.out.println("valueChange = " + valueChange.getPropertyName());
				System.out.println("left = " + left);
				System.out.println("right = " + right);
			}
		}
	}

	public static boolean isBlank(CharSequence cs) {
		int strLen;
		if (cs != null && (strLen = cs.length()) != 0) {
			for(int i = 0; i < strLen; ++i) {
				if (!Character.isWhitespace(cs.charAt(i))) {
					return false;
				}
			}

			return true;
		} else {
			return true;
		}
	}

	public static  Date findOldestDateFromList(List<Date> dates){
		return Collections.min(dates);
	}

}
