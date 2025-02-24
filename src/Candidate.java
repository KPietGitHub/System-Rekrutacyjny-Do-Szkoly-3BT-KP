import java.util.ArrayList;
import java.util.List;

public class Candidate {
    String firstName;
    String lastName;
    int age;
    Course course;
    List<Score> scores;

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

    @Override
    public String toString() {
        return "Candidate: " + firstName + " " + lastName + ", Age: " + age + ", Course: " + course;
    }
}