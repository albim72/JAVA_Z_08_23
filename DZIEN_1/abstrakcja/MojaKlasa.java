public class MojaKlasa extends Prototyp {
    int s;
    int k;

    Dodatek dodatek = new Dodatek(55);
    public MojaKlasa(int x, int y, int s) {
        super(x, y);
        this.s = s;
    }

    public MojaKlasa(int x, int y, int s, int k, Dodatek dodatek) {
        super(x, y);
        this.s = s;
        this.k = k;
        this.dodatek = dodatek;
    }

    @Override
    public int policz() {
        return (x+y)*s;
    }

    public int wynik_dod(){
        return dodatek.fx()*2;
    }

    @Override
    public void msg() {
        System.out.println("to jest wiadomość z klasy Ekstras!");
    }
}
