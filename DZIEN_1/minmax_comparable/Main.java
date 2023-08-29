public class Main {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max)>0){
            max=y;
        }

        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Maksimum z %d, %d, %d wynosi %d\n\n",13,4,56,maximum(13,4,56));
        System.out.printf("Maksimum z %f, %f, %f wynosi %f\n\n",5.66,1.99,2.01,maximum(5.66,1.99,2.01));
        System.out.printf("Maksimum z %s, %s, %s wynosi %s\n\n","gruszka","kiwi","jagoda",maximum("gruszka","kiwi","jagoda"));
        System.out.printf("Maksimum z %d, %d, %d wynosi %d\n\n",5,0,-12,maximum(5,0,-12));
       
    }
}
