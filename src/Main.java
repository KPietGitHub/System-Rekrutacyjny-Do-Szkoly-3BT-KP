public class Main {
    public static void main(String[] args) {
        School school = new School();
        Candidate candidate1 = new Candidate("John", "Doe", 18, Course.SOFTWARE_ENGINEERING);
        candidate1.addScore("Math", 85);
        candidate1.addScore("Programming", 92);

        school.addCandidate(candidate1);

        Employee reviewer = new Employee("Alice", "Smith", "Admissions Officer");

        System.out.println("\nAll Applications:");
        school.listApplications();

        Application application = school.getApplications().getFirst();
        reviewer.reviewApplication(application, true);

        System.out.println("\nUpdated Applications:");
        school.listApplications();

        // Example of messaging
        Message message = new Message("John Doe", "Admissions Office", "What is the deadline for application?");
        message.displayMessage();
    }
}