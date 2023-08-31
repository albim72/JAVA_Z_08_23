public class Callme {
    void call(String msg){
        System.out.println("[" + msg);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("]");
    }
}
