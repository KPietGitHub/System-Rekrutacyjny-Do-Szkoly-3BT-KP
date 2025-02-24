import java.util.ArrayList;
import java.util.List;

public class School {
    List<Candidate> candidates;
    List<Application> applications;

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
}