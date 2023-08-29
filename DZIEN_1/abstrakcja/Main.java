
public class Main {
    public static void main(String[] args) {

        MojaKlasa mk = new MojaKlasa(6,5,5);

        System.out.println(mk.opis());
        System.out.println(mk.policz());

        mk.msg();
        System.out.println(mk.wynik_dod());
        System.out.println(mk.dodatek.fx());
        System.out.println(mk);

    }
}
