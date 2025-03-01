import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Candidate> candidates;
    private List<Application> applications;

    public School() {
        candidates = new ArrayList<>();
        applications = new ArrayList<>();
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
        applications.add(new Application(candidate));
    }

    public void listApplications() {
        for (Application application : applications) {
            System.out.println(application);
        }
    }

    public void generateReport() {
        System.out.println("\nSchool Report:");
        for (Candidate candidate : candidates) {
            int totalScore = 0;
            for (Score score : candidate.getScores()) {
                totalScore += score.getPoints();
            }
            System.out.println(candidate.getFirstName() + " " + candidate.getLastName() + " - Total Score: " + totalScore);
        }
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }
}