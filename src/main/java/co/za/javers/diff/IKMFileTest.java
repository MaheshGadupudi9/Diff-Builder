package co.za.javers.diff;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class IKMFileTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Learn\\Diff-Builder\\src\\main\\java\\co\\za\\javers\\diff\\test.txt");
        try(BufferedReader reader= Files.newBufferedReader(path, Charset.forName("UTF-8"))){
            int count=0;
            while (reader.readLine()!=null){
                count++;
            }
            System.out.println(count);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
