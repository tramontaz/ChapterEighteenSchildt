import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        //create arrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        //use class arrayDeque for stack management
        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");

        System.out.print("Extract from stack: ");

        while (arrayDeque.peek() != null) System.out.print(arrayDeque.pop() + " ");
    }
}
