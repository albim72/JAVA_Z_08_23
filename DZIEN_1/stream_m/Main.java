import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer>  number = Arrays.asList(3,6,2,12,77,8,123,888,34,10,0,9,0);
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(number);
        System.out.println(square);
        System.out.println("_____________________________________________");
        List<String> names = Arrays.asList("Strumień","Serializacja","Kolekcja","Refleksja");
        List<String> wynik = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());

        System.out.println(names);
        System.out.println(wynik);

        System.out.println("_____________________________________________");

        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        System.out.println("_____________________________________________");

        List<String> sortshow = names.stream().sorted().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(sortshow);


        System.out.println("_____________________________________________");

        List<Integer> cubelist = number.stream().map(x->x*x*x).collect(Collectors.toList());
        System.out.println(cubelist);

        Set<Integer> cubeset = number.stream().map(x->x*x*x).collect(Collectors.toSet());
        System.out.println(cubeset);

        System.out.println("_____________________________________________");

        number.stream().filter(x->x%2==0).forEach(y-> System.out.print(y + " "));
        System.out.println();
        System.out.println(number);

        int ev = number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println(ev);

    }
}
