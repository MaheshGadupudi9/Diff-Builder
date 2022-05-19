package co.za.javers.diff;

import java.util.*;

enum PrefixType {
    Person, Director, Signatory, Entity, Account, Customer
}

enum TaskType {

    RFI("Request for Information"),  //Normal Message Board Type requests for information
    REGULATOR_REPORT("Regulator reports"),  //CTR/A, IFTR etc
    STR("Suspicious activity"),   //From the Financial Institutions case report tools,  (iCase etc)
    MANUAL("Manual"), //A manually created report?
    EXCEPTION("Exception"), //WM: exception reporting task
    IFTR_CUSTOMER("IFTR Customer"), //WM: IFTR Customer exception reporting task
    STR_CUSTOMER("STR Customer"), //WM: STR Customer exception reporting task
    AMLDS("AMLDS"), // From Actimize Alert system
    ICASE("ICASE");

    private String display;

    private TaskType(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }


}

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class TestSet {
    public static void main(String[] args) {
        final Set<String> strings = new HashSet<>();

        strings.add(null);
        strings.add("");
        strings.add("sd");
        strings.add("4566");
        strings.add("45666");

        System.out.println("strings = " + strings);

        strings.remove(null);
        strings.remove("");
        System.out.println("strings = " + strings);

        System.out.println("PrefixType.Person = " + PrefixType.Person);
        System.out.println("TaskType.STR.toString() = " + TaskType.STR);
        fun();
        String s= "Director Last Name;Director First Name;";

        final String[] split = s.split(";");

        for (String s1 : split) {
            System.out.println("s1 = " + s1);
        }
      //  final List<String> arrayList = Collections.(split);


    }

    public static void fun() {
        class Dummy {
        }
        ;
        String methodName = Dummy.class
                .getEnclosingMethod()
                .getName();

        System.out.println("Current Method is " + methodName);

    }
}