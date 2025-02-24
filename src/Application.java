import java.time.LocalDate;

public class Application {
    Candidate candidate;
    LocalDate submissionDate;
    ApplicationStatus status;

    public Application(Candidate candidate) {
        this.candidate = candidate;
        this.submissionDate = LocalDate.now();
        this.status = ApplicationStatus.SUBMITTED;
    }

    public void updateStatus(ApplicationStatus newStatus) {
        this.status = newStatus;
    }

    @Override
    public String toString() {
        return "Application for: " + candidate + ", Status: " + status + ", Submitted on: " + submissionDate;
    }
}