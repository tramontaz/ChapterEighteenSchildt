import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        //create Hash-map
        HashMap<String, Double> hashMap = new HashMap<>();

        //input elements to hash map
        hashMap.put("John Dow", 3434.34);
        hashMap.put("Tom Smith", 123.22);
        hashMap.put("Jane Baker", 1378.00);
        hashMap.put("Tod Hall", 99.22);
        hashMap.put("Ralph Smith", -19.08);

        //get a set of values
        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        //output the set of values
        for (Map.Entry<String, Double> mapEntry : set){
            System.out.print(mapEntry.getKey() + ": " + mapEntry.getValue() + "\n");
        }

        // deposit funds into an account
        double balance = hashMap.get("John Dow");
        hashMap.put("John Dow", balance + 1000);
        System.out.println("New balance on John's account: " + hashMap.get("John Dow"));
    }
}
