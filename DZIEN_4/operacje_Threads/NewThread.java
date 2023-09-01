public class NewThread implements Runnable{

    String name;
    Thread t;
    boolean suspendFlag;

    public NewThread(String threadname) {
        this.name = threadname;
        t = new Thread(this,name);
        System.out.println("Nowy wątek: " + t);
        suspendFlag = false;
    }

    @Override
    public void run() {
        try{
            for(int i=15;i>0;i--){
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("wyjście z wątku: " + name);
    }

    synchronized void mysuspend(){
        suspendFlag = true;
    }
    synchronized void mysresume(){
        suspendFlag = false;
        notify();
    }
}
