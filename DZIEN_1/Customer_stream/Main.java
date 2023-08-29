import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Adam","Nowak","Wrocław",1970));
        customers.add(new Customer("Ada","Kot","Lublin",1967));
        customers.add(new Customer("Leon","Nowik","Łódź",1972));
        customers.add(new Customer("Lidia","Nowek","Kraków",1988));
        customers.add(new Customer("Nadia","Kowal","Wrocław",1990));
        customers.add(new Customer("Jacek","Nowy","Katowice",1972));
        customers.add(new Customer("Julia","Kos","Wrocław",1979));

        List<String> names = customers.stream()
                .filter(c->c.getCity().equals("Wrocław"))
                .map(c->c.getFirstName().toUpperCase() + " " + c.getLastName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(names);

    }
}
