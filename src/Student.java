import java.util.ArrayList;
public class Student extends Person {
    private static int idCounter = 1;
    private int studentId;
    private ArrayList<Integer> grades;
    public Student(String name, String surname, ArrayList<Integer> grades) {
        super(name, surname);
        this.studentId = idCounter++;
        this.grades = grades;
    }
    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }
    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentId + " and GPA: " + String.format("%.2f", calculateGPA()) + ".";
    }
}
