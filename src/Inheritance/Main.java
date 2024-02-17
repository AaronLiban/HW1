package Inheritance;
public class Main {
    public static void main(String[] args) {

        SalariedEmployee employee1 = new SalariedEmployee();
        employee1.setFirstName("Joe");
        employee1.setLastName("Jones");
        employee1.setSocialSecurityNumber("111-11-1111");
        employee1.setWeeklySalary(2500);
        System.out.println(employee1);

        HourlyEmployee employee2 = new HourlyEmployee();
        employee2.setFirstName("Stephanie");
        employee2.setLastName("Smith");
        employee2.setSocialSecurityNumber("222-22-2222");
        employee2.setWage(25);
        employee2.setHoursWorked(32);
        System.out.println(employee2);

        HourlyEmployee employee3 = new HourlyEmployee();
        employee3.setFirstName("Mary");
        employee3.setLastName("Quinn");
        employee3.setSocialSecurityNumber("333-33-3333");
        employee3.setWage(19);
        employee3.setHoursWorked(47);
        System.out.println(employee3);

        CommissionEmployee employee4 = new CommissionEmployee();
        employee4.setFirstName("Nicole");
        employee4.setLastName("Dior");
        employee4.setSocialSecurityNumber("444-44-4444");
        employee4.setCommissionRate(0.15);
        employee4.setGrossSales(50000);
        System.out.println(employee4);

        SalariedEmployee employee5 = new SalariedEmployee();
        employee5.setFirstName("Renwa");
        employee5.setLastName("Chanel");
        employee5.setSocialSecurityNumber("555-55-5555");
        employee5.setWeeklySalary(1700);
        System.out.println(employee5);

        BaseEmployee employee6 = new BaseEmployee();
        employee6.setFirstName("Mike");
        employee6.setLastName("Davenport");
        employee6.setSocialSecurityNumber("666-66-6666");
        employee6.setBaseSalary(95000);
        System.out.println(employee6);

        CommissionEmployee employee7 = new CommissionEmployee();
        employee7.setFirstName("Mahnaz");
        employee7.setLastName("Vaziri");
        employee7.setSocialSecurityNumber("777-77-7777");
        employee7.setCommissionRate(0.22);
        employee7.setGrossSales(40000);
        System.out.println(employee7);
    }
}