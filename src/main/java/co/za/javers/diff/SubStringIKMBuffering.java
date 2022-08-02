package co.za.javers.diff;

public class SubStringIKMBuffering {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("buffering");
        sb.replace(2,7,"BUFFER");
        sb.delete(2,4);
        String s = sb.substring(1, 5);
        System.out.println(s);
    }
}
