public class Score {
    private String criterion;
    private int points;

    public Score(String criterion, int points) {
        this.criterion = criterion;
        this.points = points;
    }


    public String getCriterion() {
        return criterion;
    }

    public void setCriterion(String criterion) {
        this.criterion = criterion;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return criterion + ": " + points + " points";
    }
}