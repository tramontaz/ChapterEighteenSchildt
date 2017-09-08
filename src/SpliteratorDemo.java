import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        //create array list with double data type
        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        //use "tryAdvance() for output array list
        System.out.println("Content of array list:\n");
        Spliterator<Double> splitter = vals.spliterator();
        while (splitter.tryAdvance(System.out::println));
        System.out.println();

        //create new array list with square roots from vals
        splitter = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitter.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        //call dorEachRemaining() for output content of sqrs
        System.out.println("Content of sqrs:\n");
        splitter = sqrs.spliterator();
        splitter.forEachRemaining(System.out::println);
        System.out.println();
    }
}
