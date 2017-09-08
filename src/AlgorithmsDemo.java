import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-8);
        linkedList.add(8);

        Comparator<Integer> comparator = Collections.reverseOrder();

        linkedList.sort(comparator);

        System.out.print("Linked list sorted in reverse order: ");
        for (int i : linkedList) System.out.print(i + " ");
        System.out.println();

        Collections.shuffle(linkedList);

        //output shuffled linked list
        System.out.print("List is shuffled: ");
        for (int i : linkedList) System.out.print(i + " ");

        System.out.println("\n" + "Min: " + Collections.min(linkedList) + "\n" +
        "Max: " + Collections.max(linkedList));
    }
}
