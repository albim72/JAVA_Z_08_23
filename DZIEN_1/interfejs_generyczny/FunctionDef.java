public class FunctionDef {
    public static final Function<Integer,Integer> triple = (arg) -> {return 30*arg;};
    public static final Function<Integer,Integer> square = (arg) -> {return arg*arg;};
    
    public static final Function<Integer,Integer> compose(final Function<Integer,Integer> f1, 
                                                          final Function<Integer,Integer> f2){
        return (arg) -> {return f1.apply(f2.apply(arg));};
    }
}
