package day35_custom_classes.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Kuzzat");
        System.out.println(emp1);
        System.out.println("-----------");
        Employee employee1 = new Employee("James", 12345, "DevOps", 150_000.00);
        employee1.meeting();
        System.out.println(employee1);



        Employee employee2 = new Employee("Marjan");
        System.out.println(employee2);

        Employee empl3 = new Employee("Nonna",12);
        System.out.println(empl3);


        Employee empl4 = new Employee("Jypar", 12, "SDET" );
        System.out.println(empl4);

        Employee james = new Employee("James Bond", 7, "Spy", 10_000_000);

        System.out.println(james);

        Employee obj2 = new Employee("Ana");
        System.out.println(obj2);

        Employee obj3 = new Employee("Jane", 9);
        System.out.println(obj3);

        Employee obj4 = new Employee("Penny", 12, "CEO");
        System.out.println(obj4);

        System.out.println("-------------------------------------------------");

        EmployeeV2 james2 = new EmployeeV2("James Bond", 7, "Spy", 10_000_000);
        System.out.println(james2);

        EmployeeV2 obj10 = new EmployeeV2("Ana");
        System.out.println(obj10);

        EmployeeV2 obj11 = new EmployeeV2("Jane", 9);
        System.out.println(obj11);

        EmployeeV2 obj12 = new EmployeeV2("Penny", 12, "CEO");
        System.out.println(obj12);


        // for practice;
        Employee[] arr =new Employee[3];
        arr[0] = james;
        arr[1] = obj2;
        arr[2] = obj3;

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].name);
        System.out.println(arr[0].salary);

        ArrayList<Employee> list = new ArrayList<>();

    }
}
