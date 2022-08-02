import java.util.Random;

public class ThreadMulti {

    public static synchronized void main(String[] args) throws InterruptedException {

        System.out.println(Math.random());


        Thread thread = new Thread();
        thread.start();
        System.out.println("handle 1");
        thread.wait(10000);
        System.out.println("handle 2");
    }

}
