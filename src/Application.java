import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private Candidate candidate;
    private LocalDate submissionDate;
    private ApplicationStatus status;
    private List<String> statusHistory;

    public Application(Candidate candidate) {
        this.candidate = candidate;
        this.submissionDate = LocalDate.now();
        this.status = ApplicationStatus.SUBMITTED;
        this.statusHistory = new ArrayList<>();
        statusHistory.add("SUBMITTED");
    }

    public void updateStatus(ApplicationStatus newStatus) {
        this.status = newStatus;

        if(newStatus != ApplicationStatus.ACCEPTED){
            statusHistory.add(newStatus.toString());
        }
        else{
            statusHistory.add("ACCEPTED");
        }
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

    public List<String> getStatusHistory() {
        return statusHistory;
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

    public void setStatusHistory(List<String> statusHistory) {
        this.statusHistory = statusHistory;
    }

    @Override
    public String toString() {
        return "Application for: " + candidate + ", Status: " + status + ", Submitted on: " + submissionDate;
    }
}