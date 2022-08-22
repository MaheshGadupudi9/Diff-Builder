package co.za.javers.diff.hash;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class HashingTest {
    public static void main(String[] args) {
        /*System.out.println(hashMyValue("Pavan123"));
        System.out.println(hashMyValue("Narmada123"));
        System.out.println(hashMyValue("Mahesh123"));*/


        String password= "password@3$6";
        String username = "mahesh";
        String salt = "567";

        System.out.println(authenticateMyUser(username,password,salt));

    }

    private static String authenticateMyUser(String username, String enteredPassword, String salt) {
        String passwordHashed = dbVals().get(username);
        System.out.println("username = " + username);
        System.out.println("enteredPassword = " + enteredPassword);
        System.out.println("passwordHashed = " + passwordHashed);
        boolean equals = hashMyValue(enteredPassword+salt).equals(passwordHashed);
        if(equals){
            return "Success login for user "+username;
        }

        return "Failed login for user "+username;
    }

    private static String hashMyValue(CharSequence originalString){
        return Hashing.sha256()
                .hashString(originalString, StandardCharsets.UTF_8)
                .toString();
    }

    private static Map <String,String> dbVals(){
        HashMap <String, String> keyValueMap = new HashMap <>();
        keyValueMap.put("mahesh",hashMyValue("password@3$6"+"567"));
        keyValueMap.put("pavan",hashMyValue("pahytrues@3$6"));
        keyValueMap.put("narmada",hashMyValue("MySuffolk is the University portal for students, faculty, and staff. You can access registration, the Blackboard learning system, and other online tools and communities from here."));
        return keyValueMap;
    }
}
