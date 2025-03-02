package people;

import java.util.ArrayList;
import java.util.List;
import school.Course;
import utilities.Score;

public class Candidate extends Person {
    private int age;
    private Course course;
    private List<Score> scores;

    public Candidate(String firstName, String lastName, int age, Course course) {
        super(firstName, lastName);
        this.age = age;
        this.course = course;
        this.scores = new ArrayList<>();
    }

    public void addScore(String subject, int points) {
        scores.add(new Score(subject, points));
    }


    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }
    @Override
    public String getDetails() {
        return "Candidate: " + getFullName() + ", Age: " + age + ", Course: " + course;
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
}