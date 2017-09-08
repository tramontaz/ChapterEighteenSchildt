import java.util.LinkedList;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address (String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" + city + "\n" + state + "\n" + code;
    }

    static class MailList {
        public static void main(String[] args) {
            LinkedList<Address> ml = new LinkedList<>();

            //input elements in array list
            ml.add(new Address("Ivan Ivanov", "11 Oak Ave", "Melbourne",
                    "Victoria", "3000"));
            ml.add(new Address("Petr Petrov", "11 Krylatskaya", "Krasnodar",
                    "Krasnodarsky krai", "350000"));
            ml.add(new Address("Konstantin Grom", "Khreschatik Street", "Kiev",
                    "Kiev, city", "01001"));

            //output list of address
            for (Address address : ml) System.out.println(address + "\n");
        }
    }
}
