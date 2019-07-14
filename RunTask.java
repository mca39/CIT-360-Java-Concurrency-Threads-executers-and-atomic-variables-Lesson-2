package Threading;
import java.util.concurrent.atomic.AtomicInteger;


public class RunTask implements Runnable {

    private AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void run(){

        for(int i = 0; i < 10; i++){
            System.out.println("Running " + Thread.currentThread().getName());
            //System.out.println("The state of the thread is: " + Thread.currentThread().getState());
            counter.incrementAndGet();
            System.out.println("The value in the counter for " + Thread.currentThread().getName() + " is now: " + counter);
            //int currentValue = counter.get();
            //System.out.println("The current  value of counter is: " + currentValue);

            try{
                Thread.sleep((long)(Math.random()*1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }//close try/catch
        }//close loop
    }//Close method run
}//close class RunTask

