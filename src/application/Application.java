package application;

import people.Candidate;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private Candidate candidate;
    private ApplicationStatus status;
    private List<String> statusHistory;

    public Application(Candidate candidate) {
        this.candidate = candidate;
        this.status = ApplicationStatus.SUBMITTED;
        this.statusHistory = new ArrayList<>();
        statusHistory.add("SUBMITTED");
    }

    public void updateStatus(ApplicationStatus newStatus) {
        this.status = newStatus;

        if (newStatus != ApplicationStatus.ACCEPTED) {
            statusHistory.add(newStatus.toString());
        }
        else{
            statusHistory.add("ACCEPTED");
        }
    }

    public void viewApplicationHistory() {
        System.out.println("\nApplication history for: " + candidate.getFullName());
        for (String status : statusHistory) {
            System.out.println(" - " + status);
        }
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    public List<String> getStatusHistory() {
        return statusHistory;
    }

    public void setStatusHistory(List<String> statusHistory) {
        this.statusHistory = statusHistory;
    }

    @Override
    public String toString() {
        return "Candidate: " + candidate.getFullName() + ", Status: " + status;
    }
}