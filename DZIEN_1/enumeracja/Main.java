
public class Main {
    public static void main(String[] args) {
        Elevel mojepoziomy = Elevel.OTHER;
        Elevel drugi = Elevel.MEDIUM;

        switch (drugi){
            case LOW:
                System.out.println("niski poziom");
                break;
            case MEDIUM:
                System.out.println("średni poziom");
                break;
            case HIGH:
                System.out.println("wysoki poziom");
                break;
            case VERY_HIGH:
                System.out.println("bardzo wysoki poziom");
                break;
            case OTHER:
                System.out.println("nieoznaczony poziom");
                break;

        }

        }
    }
