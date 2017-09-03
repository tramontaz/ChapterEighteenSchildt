import java.util.ArrayList;

public class ArraListToArray {
    public static void main(String[] args) {
        //create arrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        //input elements into arrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("The content of arrayList: " + arrayList);

        //get array
        Integer intArray[] = new Integer[arrayList.size()];
        intArray = arrayList.toArray(intArray);

        int sum = 0;

        //get a sum of elements of array
        for(int i : intArray) sum += i;

        System.out.println("Sum = " + sum);
    }
}
