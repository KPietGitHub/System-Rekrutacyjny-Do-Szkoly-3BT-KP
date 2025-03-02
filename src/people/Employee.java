package people;

import application.Application;
import application.ApplicationStatus;

public class Employee extends Person {
    private String position;

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public void reviewApplication(Application application, boolean isAccepted) {
        application.updateStatus(isAccepted ? ApplicationStatus.ACCEPTED : ApplicationStatus.REJECTED);
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String getDetails() {
        return "Employee: " + getFullName() + ", Position: " + position;
    }



    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}