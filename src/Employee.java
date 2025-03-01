public class Employee {
    private String firstName;
    private String lastName;
    private String position;

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void reviewApplication(Application application, boolean approve) {
        application.updateStatus(approve ? ApplicationStatus.ACCEPTED : ApplicationStatus.REJECTED);
        System.out.println("Application reviewed by " + firstName + " " + lastName + ". Status: " + application.getStatus());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", Position: " + position;
    }
}