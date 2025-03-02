package main;

import school.*;
import people.*;
import application.*;
import utilities.*;

import java.util.Scanner;

public class RecruitmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();

        Candidate candidate1 = new Candidate("John", "Doe", 18, Course.SOFTWARE_ENGINEERING);
        candidate1.addScore("Math", 85);
        candidate1.addScore("Programming", 92);

        Candidate candidate2 = new Candidate("Alice", "Smith", 19, Course.AUTOMATION_TECHNICIAN);
        candidate2.addScore("Physics", 78);
        candidate2.addScore("Electronics", 88);

        school.addCandidate(candidate1);
        school.addCandidate(candidate2);


        Employee reviewer = new Employee("Michael", "Brown", "Admissions Officer");

        // Ocena aplikacji
        for (application.Application application : school.getApplications()) {
            System.out.println("\nReviewing application for: " + application.getCandidate().getFullName());
            System.out.println("Scores:");
            for (Score score : application.getCandidate().getScores()) {
                System.out.println(" - " + score.getSubject() + ": " + score.getPoints() + " points");
            }
            System.out.print("Accept this candidate? (yes/no): ");
            String decision = scanner.nextLine().trim().toLowerCase();
            reviewer.reviewApplication(application, decision.equals("yes"));
        }

        // Wyświetlenie wyników
        school.listApplications();
        school.generateAcceptedCandidatesReport();

        System.out.print("\nEnter the name of the candidate to view application history: ");
        String candidateName = scanner.nextLine().trim();

        boolean found = false;
        for (Application application : school.getApplications()) {
            if (application.getCandidate().getFullName().equalsIgnoreCase(candidateName)) {
                application.viewApplicationHistory();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Candidate not found.");
        }

        System.out.println("Enter minimum score to search for the candidates:");
        int minScore = scanner.nextInt();

        while(minScore < 0){
            System.out.println("You typed negative number, try again");
            minScore = scanner.nextInt();
        }

        school.printCandidatesByScore(minScore);




        // Test wiadomości
        System.out.print("\nSend a message. Enter sender name: ");
        String sender = scanner.nextLine();
        System.out.print("Enter recipient: ");
        String recipient = scanner.nextLine();
        System.out.print("Enter message: ");
        String content = scanner.nextLine();

        Message message = new Message(sender, recipient, content);
        message.displayMessage();
    }
}