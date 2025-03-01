import java.time.LocalDate;

public class Application {
    private Candidate candidate;
    private LocalDate submissionDate;
    private ApplicationStatus status;

    public Application(Candidate candidate) {
        this.candidate = candidate;
        this.submissionDate = LocalDate.now();
        this.status = ApplicationStatus.SUBMITTED;
    }

    public void updateStatus(ApplicationStatus newStatus) {
        this.status = newStatus;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Application for: " + candidate + ", Status: " + status + ", Submitted on: " + submissionDate;
    }
}