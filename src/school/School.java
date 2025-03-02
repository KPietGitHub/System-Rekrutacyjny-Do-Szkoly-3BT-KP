package school;

import application.Application;
import application.*;
import people.Candidate;
import utilities.*;

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
        System.out.println("List of the candidates (all):");
        for (Application application : applications) {
            System.out.println(application);
        }
    }

    public void generateAcceptedCandidatesReport() {
        System.out.println("\nAccepted Candidates Report:");
        for (Application application : applications) {
            if (application.getStatus() == ApplicationStatus.ACCEPTED) {
                Candidate candidate = application.getCandidate();
                System.out.println(candidate.getFullName());
            }
        }
    }

    public void printCandidatesByScore(int threshold) {
        System.out.println("\nCandidates with at least " + threshold + " points:");
        for (Candidate candidate : candidates) {
            int totalScore = 0;
            for (Score score : candidate.getScores()) {
                totalScore += score.getPoints();
            }
            if (totalScore >= threshold) {
                System.out.println(candidate.getFullName() + " - Total Score: " + totalScore);
            }
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