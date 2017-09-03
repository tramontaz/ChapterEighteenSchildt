import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //create tree set
        TreeSet<String> treeSet = new TreeSet<>();

        //input elements into treeSet
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");

        System.out.println(treeSet);

    }
}
