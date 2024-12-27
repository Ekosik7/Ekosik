import java.util.ArrayList;
import java.util.List;
public class School {
    private List<Person> members;
    public School() {
        this.members = new ArrayList<>();
    }
    public void addMember(Person member) {
        members.add(member);
    }
    public List<Person> getMembers() {
        return members;
    }
}
