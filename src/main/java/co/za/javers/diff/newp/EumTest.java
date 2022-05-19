package co.za.javers.diff.newp;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class EumTest {

    public static final int R1= 100;
    public static final String R1_Des= "R1 desc 100";
    public static final int R2= 200;
    public static final int R3= 300;
    public static void main(String[] args) {
        System.out.println("ReportType.R1.description = " + ReportType.R1.description);
        ReportType r2 = ReportType.R2;

        System.out.println("r2.typeId+\" \"+r2.description = " + r2.id + " " + r2.description);

        System.out.println("AccountType.R3.typeId+AccountType.R3.fid = " + AccountType.R3.typeId + AccountType.R3.fid);
    }
}


enum ReportType{
    R1(100,"R1 test"),
    R2(200,"R2 test"),
    R3(300,"R3 test");
    int id;
    String description;
    ReportType(int i,String description) {
       id=i;
       this.description =description;
    }
}

enum AccountType{
    R1(100,"R1 test","f100"),
    R2(200,"R2 test","f200"),
    R3(300,"R3 test","f300"),
    R4(400,"noFIud");
    int typeId;
    String accdDescription;
    String fid;
    AccountType(int i,String description, String fid) {
       typeId =i;
       this.accdDescription =description;
       this.fid=fid;
    }

    AccountType(int typeId, String accdDescription) {
        this.typeId = typeId;
        this.accdDescription = accdDescription;
    }
}