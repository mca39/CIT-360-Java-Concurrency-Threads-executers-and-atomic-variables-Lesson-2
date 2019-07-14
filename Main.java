package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main{
    public static void main (String[]args){
        System.out.println("First I'm going to run 4 threads at the same time using a runnable (RunTask class) while running four threads using executors.");
        System.out.println("The counter will stop when it reaches 10 for each thread");
        System.out.println("Thread main has started");
        System.out.println();

        runnables();
        executeThreadPool();

    }//close main method

    public static void runnables(){
        System.out.println("creating 4 threads on RunTask object");
        Thread t1 = new Thread(new RunTask());
        Thread t2 = new Thread(new RunTask());
        Thread t3 = new Thread(new RunTask());
        Thread t4 = new Thread(new RunTask());
        System.out.println("Running threads on RunTask objects");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }//close runnables

    public static void executeThreadPool(){
        System.out.println("Executing thread pool");
        ExecutorService execService = Executors.newFixedThreadPool(4);

        System.out.println("Starting ExecuteThreadPool on RunTask objects");
        execService.execute(new RunTask());
        execService.execute(new RunTask());
        execService.execute(new RunTask());
        execService.execute(new RunTask());

        execService.shutdown();

        System.out.println("ExecuteThreadPool is completed and the service is shutdown");
    }//close executeThreadPool method
}//close Main class
