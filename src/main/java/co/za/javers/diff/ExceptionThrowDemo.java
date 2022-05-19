package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class ExceptionThrowDemo {
    static String message;
    public static void main(String[] args) {
        try {
            String message = getMessage();
            System.out.println(message);
        }catch (Exception e){
            message+="F";
            System.out.println(message);
        }finally {
            System.out.println(message);
        }
    }

    private static String getMessage() throws Exception {
        String message ="A";

        try {
            throw new Exception();
        }catch (Exception e){

            try{
                try{
                    throw new Exception();
                }catch (Exception ex){
                    message+="B";
                }
                throw new Exception();
            }catch (Exception ex){
                message+="C";
            }finally {
                message+="D";
            }
        }finally {
            message+="E";
        }

        return message;
    }
}
