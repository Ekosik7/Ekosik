import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students =  School.loadStudents("C:\\Users\\Acer\\OneDrive\\Рабочий стол\\Вещи\\students.txt");
        List<Student> teachers =  School.loadStudents("C:\\Users\\Acer\\OneDrive\\Рабочий стол\\Вещи\\teachers.txt");
        for (Student student : students) {
            System.out.println(student);
        }
        for (Teacher teacher : teachers){
            System
        }
    }
}