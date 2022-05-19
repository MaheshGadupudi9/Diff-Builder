package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class InvoiceTest {
    public static void main(String[] args) {
//        System.out.println((SalesInvoice)Invoice.formatID("1234"));
        Invoice v = new Invoice();
        System.out.println(v.formatID("1234"));
    }

}

class Invoice{
    public static String formatID(String args) {
        return args+"_Invoice";
    }
}
class SalesInvoice extends Invoice{
    public static String formatID(String args) {
        return args+"_SalesInvoice";
    }
}
