import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> students = new ArrayList<>();
        Person person1 = new Person("Yeraly", "Zalel", 18, true);
        System.out.println(person1.toString());
    }
}