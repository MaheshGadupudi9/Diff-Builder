package co.za.javers.diff;

import java.util.concurrent.CompletableFuture;

/**
 * @author mahesh gadupudi
 * @project diff-builder
 */
public class ThreadAsync {
    public static void main(String[] args) {
         AsyncWork asyncWork = new AsyncWork();
        final Thread thread = new Thread(asyncWork);
      //  thread.se
       thread.start();

        CompletableFuture.runAsync(asyncWork).join();
    }
}

class AsyncWork implements Runnable{

    @Override
    public void run() {
        System.out.println("run");
    }
}