import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(3,3);
        System.out.println("the initial size of the vector: " + vector.size());
        System.out.println("the initial capacity of the vector: " + vector.capacity());
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("capacity of vector after input four elements: " + vector.capacity());
        vector.add(5);
        System.out.println("current capacity of vector: " + vector.capacity());

        vector.add(6);
        vector.add(7);
        System.out.println("current capacity of vector: " + vector.capacity());

        vector.add(9);
        vector.add(10);

        System.out.println("current capacity of vector: " + vector.capacity());

        vector.add(11);
        vector.add(12);

        System.out.println("The first element of vector: " + vector.firstElement());
        System.out.println("The last element of vector: " + vector.lastElement());

        if (vector.contains(3)) System.out.println("Vector has 3.");

        Enumeration<Integer> vectorEnumeration = vector.elements();

        System.out.println("\nelements of vector: ");
        while (vectorEnumeration.hasMoreElements()) System.out.print(vectorEnumeration.nextElement() + " ");
    }

}
