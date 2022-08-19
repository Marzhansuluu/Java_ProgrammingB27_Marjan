package day34_custom_classes.employee;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("James", 12345, "DevOps", 150_000.00);
        employee1.meeting();

        Employee employee2 = new Employee("Marjan", 1234567,"QA", 120_000.00 );


        System.out.println(employee1);
        System.out.println(employee2);


    }
}
