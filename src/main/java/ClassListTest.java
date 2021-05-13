import java.util.Arrays;
import java.util.List;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class ClassListTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("dog", "over", "good");


        System.out.println(list.stream().reduce(new String(),(x1,x2)->{
                if(x1.equals("dog"))
                    return x1;return x2;
                })

        );


    }
}
