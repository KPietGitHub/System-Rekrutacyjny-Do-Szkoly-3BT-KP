public class Score {
    String criterion;
    int points;

    public Score(String criterion, int points) {
        this.criterion = criterion;
        this.points = points;
    }

    @Override
    public String toString() {
        return criterion + ": " + points + " points";
    }
}