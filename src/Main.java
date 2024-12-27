import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        School school = new School();
        File studentsFile = new File("C:\\Users\\Acer\\OneDrive\\Рабочий стол\\Вещи\\students.txt");
        File teachersFile = new File("C:\\Users\\Acer\\OneDrive\\Рабочий стол\\Вещи\\teachers.txt");
        Scanner studentScanner = new Scanner(studentsFile);
        while (studentScanner.hasNextLine()) {
            String line = studentScanner.nextLine().trim();
            if (line.isEmpty()) continue;
            Scanner lineScanner = new Scanner(line);
            String name = lineScanner.next();
            String surname = lineScanner.next();
            int age = lineScanner.nextInt();
            boolean gender = lineScanner.next().equalsIgnoreCase("Male");
            ArrayList<Integer> grades = new ArrayList<>();
            while (lineScanner.hasNextInt()) {
                grades.add(lineScanner.nextInt());
            }
            Student student = new Student(name, surname, grades);
            student.setAge(age);
            student.setGender(gender);
            school.addMember(student);
            lineScanner.close();
        }
        studentScanner.close();
        Scanner teacherScanner = new Scanner(teachersFile);
        while (teacherScanner.hasNextLine()) {
            String line = teacherScanner.nextLine().trim();
            if (line.isEmpty()) continue;
            Scanner lineScanner = new Scanner(line);
            String name = lineScanner.next();
            String surname = lineScanner.next();
            int age = lineScanner.nextInt();
            boolean gender = lineScanner.next().equalsIgnoreCase("Male");
            String subject = lineScanner.next();
            int yearsOfExperience = lineScanner.nextInt();
            int salary = lineScanner.nextInt();
            Teacher teacher = new Teacher(name, surname, subject, yearsOfExperience, salary);
            teacher.setAge(age);
            teacher.setGender(gender);
            school.addMember(teacher);
            lineScanner.close();
        }
        teacherScanner.close();
        for (Person member : school.getMembers()) {
            System.out.println(member);
        }
    }
}
