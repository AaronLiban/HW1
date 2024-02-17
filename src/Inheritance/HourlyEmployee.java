package Inheritance;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee() {

    }
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double wage, double hoursWorked){
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' +
                ", wage=" + getWage() +
                ", hoursWorked=" + getHoursWorked() +
                '}';
    }
}
