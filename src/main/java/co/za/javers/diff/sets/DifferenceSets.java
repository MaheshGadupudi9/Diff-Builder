package co.za.javers.diff.sets;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class DifferenceSets {

    private static String createCSVAccountList(Set<String> accountsOnExceptionImportFile) {
        StringBuilder accountsCSV = new StringBuilder();
        for (String account : accountsOnExceptionImportFile) {
            accountsCSV.append(account).append(",");
        }
        return accountsCSV.toString().length()>0? accountsCSV.toString().substring(0,accountsCSV.length()-1):"";
    }

    public static void main(String[] args) {
        final HashSet<String> accountsOnExceptionTask = new HashSet<>();
        accountsOnExceptionTask.add("A1");//ctr
        accountsOnExceptionTask.add("A2");//ctr
        accountsOnExceptionTask.add("A4");//ctr
        final HashSet<String> accountsOnExceptionImportFile = new HashSet<>();
        accountsOnExceptionImportFile.add("A2");//ctr
        // {}
        accountsOnExceptionImportFile.add("A3");//ctr

        final Sets.SetView<String> toBeDroppedAccounts = Sets.difference(accountsOnExceptionTask, accountsOnExceptionImportFile);
        toBeDroppedAccounts.forEach(System.out::println);

       // System.out.println(createCSVAccountList(accountsOnExceptionImportFile));





        /*final Sets.SetView<String> accountsUnmatched = Sets.symmetricDifference(accountsOnExceptionTask, accountsOnExceptionImportFile);
        accountsUnmatched.forEach(System.out::println);
        System.out.println("======");
        final Sets.SetView<String> difference = Sets.symmetricDifference(accountsOnExceptionImportFile, accountsUnmatched);
        difference.forEach(System.out::println);

        System.out.println("======");
        Sets.difference(accountsOnExceptionTask,accountsOnExceptionImportFile).forEach(System.out::println);
        System.out.println("======");
        Set<String> accountsAvailableForCurrentDay = new HashSet<>();
        Set<String> accountsAvailableForYesterday = new HashSet<>();
        for (String accountOnTask : accountsOnExceptionImportFile) {
            if (accountsOnExceptionTask.contains(accountOnTask)) {
                accountsAvailableForYesterday.add(accountOnTask);
            } else  {
                accountsAvailableForCurrentDay.add(accountOnTask);
            }
        }

        System.out.println("accountsAvailableForYesterday = " + accountsAvailableForYesterday);
        System.out.println("accountsAvailableForCurrentDay = " + accountsAvailableForCurrentDay);*/
    }
}
