import java.util.ArrayList;
import java.util.List;

public class Candidate {
    private String firstName;
    private String lastName;
    private int age;
    private Course course;
    private List<Score> scores;

    public Candidate(String firstName, String lastName, int age, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.scores = new ArrayList<>();
    }

    public void addScore(String criterion, int points) {
        scores.add(new Score(criterion, points));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Candidate: " + firstName + " " + lastName + ", Age: " + age + ", Course: " + course;
    }
}