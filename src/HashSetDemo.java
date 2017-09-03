import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //create hash set
        HashSet<String> hashSet = new HashSet<>();

        //input elements into hashSet
        hashSet.add("Alf");
        hashSet.add("Betta");
        hashSet.add("Eta");
        hashSet.add("Gamma");
        hashSet.add("Epsilon");
        hashSet.add("Omega");

        System.out.println(hashSet);
    }
}
