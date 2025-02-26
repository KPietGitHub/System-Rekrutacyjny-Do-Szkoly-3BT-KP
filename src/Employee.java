public class Employee {
    String firstName;
    String lastName;
    String position;

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void reviewApplication(Application application, boolean approve) {
        application.updateStatus(approve ? ApplicationStatus.ACCEPTED : ApplicationStatus.REJECTED);
        System.out.println("Application reviewed by " + firstName + " " + lastName + ". Status: " + application.status);
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", Position: " + position;
    }
}