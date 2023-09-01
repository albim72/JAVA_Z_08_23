import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{
    String name;
    CountDownLatch latch;

    public MyThread(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(name+": " +i);
            latch.countDown();
        }
        
    }
}
