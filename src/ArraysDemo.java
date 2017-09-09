import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = -3 * i;
        }

        System.out.println("Original array: ");
        display(array);

        System.out.println("Sorted array: ");
        Arrays.sort(array);
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.println("Filled array: ");
        display(array);

        System.out.println("Sorted again array: ");
        Arrays.sort(array);
        display(array);

        System.out.println("-9 on position: ");
        System.out.println(Arrays.binarySearch(array, -9));
    }

    private static void display(int[] array) {
        for (int i : array) System.out.print(i + " ");
        System.out.println();
    }

}
