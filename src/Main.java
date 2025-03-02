import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();

        // Dodanie kilku kandydatów na "sztywno"
        Candidate candidate1 = new Candidate("John", "Doe", 18, Course.SOFTWARE_ENGINEERING);
        candidate1.addScore("Math", 85);
        candidate1.addScore("Programming", 92);

        Candidate candidate2 = new Candidate("Alice", "Smith", 19, Course.AUTOMATION_TECHNICIAN);
        candidate2.addScore("Physics", 78);
        candidate2.addScore("Electronics", 88);

        Candidate candidate3 = new Candidate("Robert", "Johnson", 20, Course.LOGISTICS);
        candidate3.addScore("Logistics", 90);
        candidate3.addScore("Management", 76);

        school.addCandidate(candidate1);
        school.addCandidate(candidate2);
        school.addCandidate(candidate3);


        Employee reviewer = new Employee("Michael", "Brown", "Admissions Officer");

        System.out.println("\nAll Applications:");
        school.listApplications();

        // Sprawdzanie aplikacji
        for (Application application : school.getApplications()) {
            System.out.println("\nReviewing application for: " + application.getCandidate().getFirstName() + " " + application.getCandidate().getLastName());
            System.out.print("Accept this candidate? (yes/no): ");
            String decision = scanner.nextLine().trim().toLowerCase();
            reviewer.reviewApplication(application, decision.equals("yes"));
        }

        // Zaktualizowane aplikacje
        System.out.println("\nUpdated Applications:");
        school.listApplications();

        // Wyszukiwanie kandydatow wzgledem punktow
        System.out.print("\nEnter minimum score to filter candidates: ");
        int threshold = scanner.nextInt();
        scanner.nextLine();
        school.filterCandidatesByScore(threshold);

        // Raport tylko zaakceptowanych kandydatow
        school.generateAcceptedCandidatesReport();

        // Wyświetlenie historii aplikacji
        school.viewApplicationHistory();

        // Test komunikacji
        System.out.print("\nSend a message as a candidate. Enter your name: ");
        String sender = scanner.nextLine();
        System.out.print("Enter recipient (e.g., 'Admissions Office'): ");
        String recipient = scanner.nextLine();
        System.out.print("Enter message content: ");
        String content = scanner.nextLine();

        Message message = new Message(sender, recipient, content);
        message.displayMessage();
    }
}