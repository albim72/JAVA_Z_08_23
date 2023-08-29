import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,-19,7,-22,56);
        System.out.println("Posortowany strumień danych za pomocą komparatora: ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
