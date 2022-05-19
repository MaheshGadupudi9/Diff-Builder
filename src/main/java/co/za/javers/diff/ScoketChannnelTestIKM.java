package co.za.javers.diff;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class ScoketChannnelTestIKM {
    ServerSocketChannel serverSocketChannel;

    public ScoketChannnelTestIKM() throws IOException {
        this.serverSocketChannel = ServerSocketChannel.open();
        /*this.serverSocketChannel = new */

        String s=java.util.Optional.of("Hi").get();
        String s1 = Integer.valueOf("1").toString();

    }

    public static void main(String[] args) {
        int x=2;
        x = ~(x<<1);
        System.out.println("x = " + x);
    }
}
