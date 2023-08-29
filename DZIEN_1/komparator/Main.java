import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(111,"Zenobiusz","Złota 4 Kraków"));
        ar.add(new Student(222,"Anna","Złota 4 Kraków"));
        ar.add(new Student(555,"Leon","Złota 7 Kraków"));
        ar.add(new Student(333,"Nadia","Złota 11 Kraków"));
        ar.add(new Student(444,"Zofia","Złota 12 Kraków"));

        System.out.println("nieposortowane: ");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        System.out.println("______________________________________________");

        Collections.sort(ar,new SortByRoll());
        System.out.println("Posortowane po nr albumu: ");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        System.out.println("______________________________________________");

        Collections.sort(ar,new SortByName());
        System.out.println("Posortowane po imieniu: ");
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
