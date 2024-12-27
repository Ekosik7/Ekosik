import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLoader {
    public static List<Student> loadStudents(String filePath) throws Exception {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(new File(filePath));
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            Scanner lineScanner = new Scanner(line);
            String name = lineScanner.next().trim();
            String surname = lineScanner.next().trim();
            int age = lineScanner.nextInt();
            boolean gender = lineScanner.nextBoolean();
            ArrayList<Integer> grades = new ArrayList<>();
            while (lineScanner.hasNextInt()) {
                grades.add(lineScanner.nextInt());
            }
            Student student = new Student(name, surname, grades);
            student.setAge(age);
            student.setGender(gender);
            students.add(student);
            lineScanner.close();
        }
        sc.close();
        return students;
    }

    public static List<Teacher> loadTeachers(String filePath) throws Exception {
        List<Teacher> teachers = new ArrayList<>();
        Scanner sc = new Scanner(new File(filePath));
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            Scanner lineScanner = new Scanner(line);
            String name = lineScanner.next().trim();
            String surname = lineScanner.next().trim();
            int age = lineScanner.nextInt();
            boolean gender = lineScanner.nextBoolean();
            String subject = lineScanner.next().trim();
            int yearsOfExperience = lineScanner.nextInt();
            int salary = lineScanner.nextInt();
            Teacher teacher = new Teacher(name, surname, subject, yearsOfExperience, salary);
            teacher.setAge(age);
            teacher.setGender(gender);
            teachers.add(teacher);
            lineScanner.close();
        }
        sc.close();
        return teachers;
    }
}
