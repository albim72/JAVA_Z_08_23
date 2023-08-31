public class NewThread implements Runnable{
    Thread t;
    public NewThread() {
        t = new Thread(this,"nowy wątek");
        System.out.println("wątek potomny: " + t);
    }

    @Override
    public void run() {
        try{
            for(int i=5;i>0;i--){
                System.out.println("wątek potomny: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("wyjście z wątku potomnego...");
    }
}
