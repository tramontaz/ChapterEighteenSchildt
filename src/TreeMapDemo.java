import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // create tree map
        TreeMap<String, Double> tm = new TreeMap<>();

        //input elements into tree map
        tm.put("John Dow", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        //get a set from tree map
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //output set
        for(Map.Entry<String, Double> mapEntry : set){
            System.out.print(mapEntry.getKey() + ": " + mapEntry.getValue() + "\n");
        }

        //popup John's balance
        tm.put("John Dow", tm.get("John Dow") + 1000);
        System.out.println("New balance on John's account: " +  tm.get("John Dow"));
    }
}
