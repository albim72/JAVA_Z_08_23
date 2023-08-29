
public class Main {
    public static void main(String[] args) {
        Twice<String,Integer> tw1 = new Twice<String,Integer>("kolor nr 56",56);
        tw1.print();

        Twice<Boolean,Double> tw2 = new Twice<>(true,8.99);
        tw2.print();

        System.out.println("_____________________________________________");

        GenericsType<Double> g1 = new GenericsType<>();
        g1.setT(12.67854);

        GenericsType<Double> g2 = new GenericsType<>();
        g2.setT(12.67854);

        boolean isEqual = GMethods.<Double>isEqual(g1,g2);
        System.out.println(isEqual);

        isEqual = GMethods.isEqual(g1,g2);
        System.out.println(isEqual);

    }
}
