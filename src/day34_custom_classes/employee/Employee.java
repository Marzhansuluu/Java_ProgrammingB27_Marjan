package day34_custom_classes.employee;

public class Employee {
    /*
    create a class called Employee
        - data:
            name, id, job title, salary
        - constructor
            - create a constructor that creates an Employee object with the name, id, job title, and salary
        - method:
            goToMeeting()
                when this method is called print:
                    $name is going to a meeting
            toString()
                print all the employees information
    Create a separate class to create and test the Employee objects
     */
 String name;
 int ID;
 String jobTitle;
 double salary;

 public Employee (String name, int ID, String jobTitle, double salary){
     this.name =name;
     this.ID = ID;
     this.jobTitle =jobTitle;
     this.salary =salary;

 }

    public void meeting() {
        System.out.println(name + " is going to meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary + ", "+ name + " is going to meeting" +
                '}';
    }
}
