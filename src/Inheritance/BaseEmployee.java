package Inheritance;

public class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee() {

    }
    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber,
                        double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' +
                ", baseSalary=" + getBaseSalary() +
                '}';
    }
}
