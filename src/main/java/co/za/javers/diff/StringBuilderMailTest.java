package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class StringBuilderMailTest {

    public static void main(String[] args) {
        final String body ="Good day,\n" +
                "\n" +
                "The GATR importing process have not recevied files.\n" +
                "\n" +
                "\n%S\n" +
                "\n" +
                "Please investigate why the required files did not process in GATR.\n" +
                "\n" +
                "\n" +
                "Kind regards,\n" +
                "GATR system\n";

        StringBuilder dataContent =new StringBuilder();
        dataContent.append("Below are the files not recevied.\n");

        if (1==0) {
            dataContent.append("Customer Data Import Files. \n");
        }

        if (0==0) {
            dataContent.append("Transaction Data Import Files. \n");
        }

        if (0==0) {
            dataContent.append("Bop Data Import Files. \n");
        }

        final String mailBody = String.format(body, dataContent);


        System.out.println("mailBody = " + mailBody);
    }
    
}
