import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String aStr, bStr;
        aStr = o1;
        bStr = o2;
        return bStr.compareTo(aStr);
    }
}

class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new MyComparator());
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");

        //output elements from tree set
        for (String elements : treeSet) System.out.print(elements + " ");
    }
}
