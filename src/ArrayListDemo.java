import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //create arrayList:
        ArrayList<String> arrayList = new ArrayList<String>();

        System.out.println("The initial size of array: " + arrayList.size());

        //input elements into arrayList:
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1, "A2");
        System.out.println("The size of arrayList after input elements: " + arrayList.size());

        //Print the arrayList:
        System.out.println("The content of arrayList: " + arrayList);

        //Remove elements from arrayList:
        arrayList.remove("F");
        arrayList.remove(2);
        System.out.println("Size of arrayList after removing elements: " + arrayList.size());

        System.out.println("The content of arrayList: " + arrayList);
    }
}
