public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;
    public Teacher(String name, String surname, String subject, int yearsOfExperience, int salary) {
        super(name, surname);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ", have " + yearsOfExperience + " years of experience, and earn a salary of " + salary + ".";
    }
}
