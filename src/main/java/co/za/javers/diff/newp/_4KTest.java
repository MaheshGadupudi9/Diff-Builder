package co.za.javers.diff.newp;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class _4KTest {

    private static String comment = null;

    public static void main(String[] args) {
        int taskAssignmentCount = 1;
        Object taskFairLoad = null;
        String cmnt = 101 + ",";

        if (taskFairLoad == null) {
            cmnt = "TASK IDS:" + 101;
        }
        for (int i = 200; i < 910; i++) {

            if (taskFairLoad != null) {
                if (comment != null) {
                    comment = (comment + "," + cmnt);
                    if (comment.length() > 4000) {
                        comment = (comment.substring(0, 3999));
                    }
                } else {
                    comment = (cmnt);
                }
            } else {
                taskFairLoad = new Object();
                comment = (cmnt);
            }
            cmnt = i+"("+i+")    ";
        }


        System.out.println(comment);
        System.out.println(comment.length());
        System.out.println(cmnt);

    }
}