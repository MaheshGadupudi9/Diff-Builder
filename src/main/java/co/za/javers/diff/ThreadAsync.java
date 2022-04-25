package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class ThreadAsync {
    public static void main(String[] args) {
         AsyncWork asyncWork = new AsyncWork();
        final Thread thread = new Thread(asyncWork);
      //  thread.se
        thread.start();
    }
}

class AsyncWork implements Runnable{

    @Override
    public void run() {
        System.out.println("run");
    }
}