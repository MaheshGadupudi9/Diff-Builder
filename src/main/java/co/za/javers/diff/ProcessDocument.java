package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class ProcessDocument extends EmailDocument {

    public static void main(String[] args) {
        System.out.println("PreProcess doc before sned");
        new ProcessDocument();
        System.out.println("Document has been proced and send");
    }
}



class SendDocument{
    {
        System.out.println("In SendDocument");
    }

    public SendDocument() {
        System.out.println("Start to SendDocument");
    }
}

class EmailDocument extends SendDocument{
   static  {
        System.out.println("In EmailDocument");
    }

    public EmailDocument() {
        System.out.println("Start to EmailDocument");
    }
    {
        System.out.println("EmailDocument is in progress");
    }
    static {
        System.out.println("EmailDocument is completed");
    }
}