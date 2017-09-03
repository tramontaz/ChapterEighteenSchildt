import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        //input elements into arrayList:
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        //use iterator for print content of array list
        System.out.print("The content of arrayList: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        //use list iterator for edit content of list:
        ListIterator<String> listIterator = al.listIterator();
        while (listIterator.hasNext()){
            String element = listIterator.next();
            listIterator.set(element + "+");
        }

        System.out.print("The edit content of arrayList: ");
        itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        //The content of arrayList in reverse order
        System.out.print("The content of arrayList in reverse order: ");
        while (listIterator.hasPrevious()){
            String element = listIterator.previous();
            System.out.print(element + " ");
        }
    }
}
