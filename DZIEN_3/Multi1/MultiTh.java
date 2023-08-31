public class MultiTh extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("Wątek " + String.valueOf(Thread.currentThread()) + " pracuje!");
        }catch (Exception var2){
            System.out.println("problem z wątkiem: " + var2);
        }
    }
}
