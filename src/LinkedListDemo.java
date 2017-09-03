import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //create Linked List
        LinkedList<String> linkedList = new LinkedList<>();

        //input elements into linkedList
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1, "A2");

        System.out.println("The content of linkedList: " + linkedList);

        //remove elements from linked list
        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("The content of linked list after removing elements: " + linkedList);

        //remove first and last element
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("The content of linked list after removing first and second elements: " + linkedList);

        //get and set value
        String val = linkedList.get(2);
        linkedList.set(2, val + " changed");

        System.out.println("The content of linked list after changing elements: " + linkedList);
    }
}
