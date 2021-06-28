package co.za.javers.diff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * @author mahesh gadupudi
 * @project edit
 */
public class ClassListTest {
    public static void main(String[] args) throws IOException {
        List<String> list = Arrays.asList("dog", "over", "good");


        System.out.println(list.stream().reduce(new String(),(x1,x2)->{
                if(x1.equals("dog"))
                    return x1;return x2;
                })

        );


        System.out.println(Math.round(Math.random()*10));
        System.out.println(Math.round(Math.random()%10));
        System.out.println((Math.random()*10));
//        ServerSocket serverSocket = new ServerSocket(100);


//        new BufferedReader(new InputStreamReader(serverSocket.accept().getSt));

    }

    public static void m1(){
//        Locale locale = new Locale("en", "Us", true);
        Locale locale = Locale.forLanguageTag("");
        locale = new Locale("th", "TH");
//        Locale locale1 = new Locale();
//         locale =  Locale.Builder().set
    }
}
