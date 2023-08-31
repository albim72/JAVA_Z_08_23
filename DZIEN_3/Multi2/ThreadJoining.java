public class ThreadJoining extends Thread{
    @Override
    public void run() {
        for (int i=0;i<2;i++) {
            try {
                Thread.sleep(500);
                System.out.println("Aaktualny wątek: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i); 
        }
        
    }
}
