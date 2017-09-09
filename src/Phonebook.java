import java.io.*;
import java.util.Properties;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fileInputStream = null;
        boolean changed = false;

        //try to open phonebook.dat
        String phonebook = "phonebook.dat";
        try {
            fileInputStream = new FileInputStream(phonebook);
        } catch (FileNotFoundException e) {
            //ignore missing file
        }
        if (fileInputStream != null) {
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("File reading error!");
            }
        }
        do {
            System.out.println("Please, input name. Input 'exit' for abort");
            name = bufferedReader.readLine();
            if (name.equals("exit")) continue;
            System.out.println("Please input the number: ");
            number = bufferedReader.readLine();
            properties.put(name, number);
            changed = true;
        }
        while (!name.equals("exit"));

        //save phonebook if it was changed
        if (changed) {
            FileOutputStream fileOutputStream = new FileOutputStream(phonebook);
            properties.store(fileOutputStream, "Phone book");
            fileOutputStream.close();
        }
        //search a number by name
        do {
            System.out.println("Please input name fo search. Input 'exit' for abort: ");
            name = bufferedReader.readLine();
            if(name.equals("exit")) continue;
            number = (String) properties.get(name);
            System.out.println(number);
        } while (!name.equals("exit"));
    }
}
