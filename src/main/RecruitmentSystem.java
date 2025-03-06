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



        Employee reviewer1 = new Employee("Michael", "Brown", "Admissions Officer");
        Employee reviewer2 = new Employee("Emily", "Davis", "Head of Admissions");
        Employee reviewer3 = new Employee("Daniel", "Wilson", "Recruitment Specialist");
        Employee reviewer4 = new Employee("Sophia", "Taylor", "Application Reviewer");
        Employee reviewer5 = new Employee("James", "Anderson", "Student Coordinator");
        Employee reviewer6 = new Employee("Olivia", "Thomas", "HR Representative");
        Employee reviewer7 = new Employee("Ethan", "Martinez", "Academic Counselor");
        Employee reviewer8 = new Employee("Ava", "White", "Enrollment Manager");
        Employee reviewer9 = new Employee("Alexander", "Harris", "Guidance Counselor");
        Employee reviewer10 = new Employee("Charlotte", "Lewis", "Senior Admissions Officer");



        Candidate candidate1 = new Candidate("John", "Doe", 18, Course.SOFTWARE_ENGINEERING);
        Candidate candidate2 = new Candidate("Alice", "Smith", 19, Course.AUTOMATION_TECHNICIAN);
        Candidate candidate3 = new Candidate("Michael", "Brown", 22, Course.INFORMATION_TECHNOLOGY);
        Candidate candidate4 = new Candidate("Emma", "Johnson", 18, Course.MECHANICAL_ENGINEERING);
        Candidate candidate5 = new Candidate("Daniel", "Williams", 20, Course.AUTOMATION_TECHNICIAN);
        Candidate candidate6 = new Candidate("Sophia", "Garcia", 19, Course.COMPUTER_SCIENCE);
        Candidate candidate7 = new Candidate("Ethan", "Martinez", 23, Course.INFORMATION_TECHNOLOGY);
        Candidate candidate8 = new Candidate("Ava", "Rodriguez", 18, Course.MECHANICAL_ENGINEERING);
        Candidate candidate9 = new Candidate("James", "Lopez", 21, Course.AUTOMATION_TECHNICIAN);
        Candidate candidate10 = new Candidate("Olivia", "Gonzalez", 20, Course.COMPUTER_SCIENCE);
        Candidate candidate11 = new Candidate("Benjamin", "Harris", 19, Course.INFORMATION_TECHNOLOGY);
        Candidate candidate12 = new Candidate("Mia", "Clark", 22, Course.MECHANICAL_ENGINEERING);
        Candidate candidate13 = new Candidate("Lucas", "Young", 21, Course.AUTOMATION_TECHNICIAN);
        Candidate candidate14 = new Candidate("Amelia", "Allen", 20, Course.COMPUTER_SCIENCE);
        Candidate candidate15 = new Candidate("Henry", "King", 18, Course.INFORMATION_TECHNOLOGY);
        Candidate candidate16 = new Candidate("Evelyn", "Scott", 19, Course.MECHANICAL_ENGINEERING);
        Candidate candidate17 = new Candidate("Mason", "Adams", 23, Course.AUTOMATION_TECHNICIAN);
        Candidate candidate18 = new Candidate("Harper", "Nelson", 20, Course.COMPUTER_SCIENCE);
        Candidate candidate19 = new Candidate("Liam", "Carter", 22, Course.INFORMATION_TECHNOLOGY);
        Candidate candidate20 = new Candidate("Ella", "Mitchell", 21, Course.MECHANICAL_ENGINEERING);
        Candidate candidate21 = new Candidate("Noah", "Perez", 19, Course.AUTOMATION_TECHNICIAN);
        Candidate candidate22 = new Candidate("Scarlett", "Roberts", 18, Course.COMPUTER_SCIENCE);
        Candidate candidate23 = new Candidate("William", "Campbell", 20, Course.INFORMATION_TECHNOLOGY);
        Candidate candidate24 = new Candidate("Grace", "Evans", 21, Course.MECHANICAL_ENGINEERING);
        Candidate candidate25 = new Candidate("Jackson", "Stewart", 19, Course.AUTOMATION_TECHNICIAN);
        Candidate candidate26 = new Candidate("Chloe", "Edwards", 23, Course.COMPUTER_SCIENCE);
        Candidate candidate27 = new Candidate("Sebastian", "Collins", 18, Course.INFORMATION_TECHNOLOGY);
        Candidate candidate28 = new Candidate("Zoe", "Morris", 20, Course.MECHANICAL_ENGINEERING);
        Candidate candidate29 = new Candidate("David", "Ramirez", 22, Course.AUTOMATION_TECHNICIAN);
        Candidate candidate30 = new Candidate("Madison", "Bell", 21, Course.COMPUTER_SCIENCE);
        Candidate candidate31 = new Candidate("Joseph", "Gomez", 19, Course.INFORMATION_TECHNOLOGY);
        Candidate candidate32 = new Candidate("Lily", "Bennett", 20, Course.MECHANICAL_ENGINEERING);
        Candidate candidate33 = new Candidate("Samuel", "Foster", 18, Course.AUTOMATION_TECHNICIAN);
        Candidate candidate34 = new Candidate("Avery", "Gray", 23, Course.COMPUTER_SCIENCE);
        Candidate candidate35 = new Candidate("Gabriel", "Hughes", 22, Course.INFORMATION_TECHNOLOGY);
        Candidate candidate36 = new Candidate("Victoria", "Sanders", 21, Course.MECHANICAL_ENGINEERING);
        Candidate candidate37 = new Candidate("Carter", "Price", 19, Course.AUTOMATION_TECHNICIAN);
        Candidate candidate38 = new Candidate("Stella", "Ward", 20, Course.COMPUTER_SCIENCE);
        Candidate candidate39 = new Candidate("Owen", "Murphy", 18, Course.INFORMATION_TECHNOLOGY);
        Candidate candidate40 = new Candidate("Natalie", "Bailey", 22, Course.MECHANICAL_ENGINEERING);



        school.addCandidate(candidate1);
        school.addCandidate(candidate2);
        school.addCandidate(candidate3);
        school.addCandidate(candidate4);
        school.addCandidate(candidate5);
        school.addCandidate(candidate6);
        school.addCandidate(candidate7);
        school.addCandidate(candidate8);
        school.addCandidate(candidate9);
        school.addCandidate(candidate10);
        school.addCandidate(candidate11);
        school.addCandidate(candidate12);
        school.addCandidate(candidate13);
        school.addCandidate(candidate14);
        school.addCandidate(candidate15);
        school.addCandidate(candidate16);
        school.addCandidate(candidate17);
        school.addCandidate(candidate18);
        school.addCandidate(candidate19);
        school.addCandidate(candidate20);
        school.addCandidate(candidate21);
        school.addCandidate(candidate22);
        school.addCandidate(candidate23);
        school.addCandidate(candidate24);
        school.addCandidate(candidate25);
        school.addCandidate(candidate26);
        school.addCandidate(candidate27);
        school.addCandidate(candidate28);
        school.addCandidate(candidate29);
        school.addCandidate(candidate30);
        school.addCandidate(candidate31);
        school.addCandidate(candidate32);
        school.addCandidate(candidate33);
        school.addCandidate(candidate34);
        school.addCandidate(candidate35);
        school.addCandidate(candidate36);
        school.addCandidate(candidate37);
        school.addCandidate(candidate38);
        school.addCandidate(candidate39);
        school.addCandidate(candidate40);

        candidate1.addScore("Physics", 78);
        candidate1.addScore("Mathematics", 88);

        candidate2.addScore("Physics", 82);
        candidate2.addScore("Computer Science", 85);

        candidate3.addScore("Physics", 91);
        candidate3.addScore("Chemistry", 79);

        candidate4.addScore("Physics", 74);
        candidate4.addScore("Biology", 90);

        candidate5.addScore("Physics", 80);
        candidate5.addScore("Geography", 84);

        candidate6.addScore("Physics", 89);
        candidate6.addScore("History", 87);

        candidate7.addScore("Physics", 93);
        candidate7.addScore("Philosophy", 83);

        candidate8.addScore("Physics", 77);
        candidate8.addScore("Art", 92);

        candidate9.addScore("Physics", 85);
        candidate9.addScore("Literature", 86);

        candidate10.addScore("Physics", 79);
        candidate10.addScore("Economics", 91);

        candidate11.addScore("Physics", 84);
        candidate11.addScore("Psychology", 78);

        candidate12.addScore("Physics", 76);
        candidate12.addScore("Music", 88);

        candidate13.addScore("Physics", 90);
        candidate13.addScore("Sociology", 82);

        candidate14.addScore("Physics", 87);
        candidate14.addScore("Political Science", 80);

        candidate15.addScore("Physics", 83);
        candidate15.addScore("Law", 89);

        candidate16.addScore("Physics", 81);
        candidate16.addScore("Business Studies", 92);

        candidate17.addScore("Physics", 78);
        candidate17.addScore("Linguistics", 85);

        candidate18.addScore("Physics", 88);
        candidate18.addScore("Environmental Science", 94);

        candidate19.addScore("Physics", 91);
        candidate19.addScore("Astronomy", 86);

        candidate20.addScore("Physics", 75);
        candidate20.addScore("Statistics", 84);

        candidate21.addScore("Physics", 92);
        candidate21.addScore("Anthropology", 79);

        candidate22.addScore("Physics", 86);
        candidate22.addScore("Mathematics", 91);

        candidate23.addScore("Physics", 80);
        candidate23.addScore("Philosophy", 82);

        candidate24.addScore("Physics", 77);
        candidate24.addScore("Art", 80);

        candidate25.addScore("Physics", 83);
        candidate25.addScore("Literature", 93);

        candidate26.addScore("Physics", 79);
        candidate26.addScore("History", 87);

        candidate27.addScore("Physics", 90);
        candidate27.addScore("Psychology", 76);

        candidate28.addScore("Physics", 81);
        candidate28.addScore("Sociology", 89);

        candidate29.addScore("Physics", 79);
        candidate29.addScore("Computer Science", 91);

        candidate30.addScore("Physics", 82);
        candidate30.addScore("Biology", 85);

        candidate31.addScore("Physics", 86);
        candidate31.addScore("Environmental Science", 80);

        candidate32.addScore("Physics", 93);
        candidate32.addScore("Geography", 81);

        candidate33.addScore("Physics", 87);
        candidate33.addScore("Economics", 82);

        candidate34.addScore("Physics", 78);
        candidate34.addScore("Political Science", 83);

        candidate35.addScore("Physics", 80);
        candidate35.addScore("Philosophy", 88);

        candidate36.addScore("Physics", 90);
        candidate36.addScore("Law", 84);

        candidate37.addScore("Physics", 91);
        candidate37.addScore("Literature", 77);

        candidate38.addScore("Physics", 89);
        candidate38.addScore("History", 92);

        candidate39.addScore("Physics", 85);
        candidate39.addScore("Astronomy", 80);

        candidate40.addScore("Physics", 79);
        candidate40.addScore("Mathematics", 86);


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