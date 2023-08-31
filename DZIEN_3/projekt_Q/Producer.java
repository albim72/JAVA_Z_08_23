public class Producer implements Runnable {
    Q q;
    Thread t;

    public Producer(Q q) {
        this.q = q;
        t = new Thread(this,"Producent");
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            q.put(i++);
        }
    }
}
