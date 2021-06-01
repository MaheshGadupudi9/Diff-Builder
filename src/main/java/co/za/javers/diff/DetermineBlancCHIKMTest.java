package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class DetermineBlancCHIKMTest {
    public static void main(String[] args) {
        String str = " a b a ";

        String newChars = str.strip().repeat(4);

        String[] split = newChars.split("[ab]");

        int blank=0;

        for (String s : split) {
            if(s.isBlank()){
                blank++;
            }
        }

        System.out.println("blank = " + blank);
    }
}
