import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {

        Singleton inst1 = Singleton.instance;
        Singleton inst2 = Singleton.instance;
        Singleton inst3 = Singleton.instance;


        System.out.println("__________________________________");
        System.out.println(inst1 == inst2);
        System.out.println("inst1 hashcode: " + inst1.hashCode());
        System.out.println("inst2 hashcode: " + inst2.hashCode());

        System.out.println("__________________________________");
        System.out.println(inst1 == inst3);
        System.out.println("inst1 hashcode: " + inst1.hashCode());
        System.out.println("inst3 hashcode: " + inst3.hashCode());

        System.out.println("__________________________________");

        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for(Constructor constructor:constructors){
                constructor.setAccessible(true);
                inst2 = (Singleton) constructor.newInstance();
                break;
            }
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println("inst1 hashcode: " + inst1.hashCode());
        System.out.println("inst2 hashcode: " + inst2.hashCode());
    }
}
