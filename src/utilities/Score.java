package utilities;

public class Score {
    private String subject;
    private int points;

    public Score(String subject, int points) {
        this.subject = subject;
        this.points = points;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}