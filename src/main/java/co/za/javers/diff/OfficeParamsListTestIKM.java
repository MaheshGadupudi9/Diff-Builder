package co.za.javers.diff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class OfficeParamsListTestIKM {
    public static void main(String[] args) {
        List<Map<List<Integer>,List<String>>> officeParams = new ArrayList<>();

        Map<List<Integer>,List<String>> officeParamMap = new HashMap<>();

        officeParams.add(null);
        officeParams.add(officeParamMap);
        officeParams.add(new HashMap<List<Integer>,List<String>>());

        officeParams.forEach(e-> System.out.println("e = " + e) );

    }
}
