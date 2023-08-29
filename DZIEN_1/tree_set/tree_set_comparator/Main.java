import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("G");
        treeSet.add("H");
        treeSet.add("GN");
        treeSet.add("22");
        treeSet.add("??");
        treeSet.add("NU");
        treeSet.add("-X-");

        System.out.println("Zbiór przed użyciem komparatora: " + treeSet);

        TreeSet<String> treeSet1 = new TreeSet<>(new Helper());
        treeSet1.add("G");
        treeSet1.add("H");
        treeSet1.add("GN");
        treeSet1.add("22");
        treeSet1.add("??");
        treeSet1.add("NU");
        treeSet1.add("-X-");

        System.out.println("Zbiór po użyciu komparatora: " + treeSet1);
    }
}
