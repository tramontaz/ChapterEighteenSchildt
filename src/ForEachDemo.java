import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        //create array list with integers
        ArrayList<Integer> vals = new ArrayList<>();

        //input integers to array list
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        //organize a loop for output integers
        System.out.print("Original value of array list: ");
        for (int v : vals){
            System.out.print(v + " ");
        }

        System.out.println();

        //get a sum of integers using loop "for"
        int sum = 0;
        for (int v : vals) sum += v;

        System.out.println("The sum of integers: " + sum);
    }
}
