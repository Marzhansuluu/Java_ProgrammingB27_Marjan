package day04_variables;

public class Employee {
    public static void main(String[]args){
        String name="John";
        String lastName="Al";
        String company="Apple";
        String job="SDET";
        char suite='C';
        int employeeId=1234;
        byte numberOfPTO=10;
        double salary= 159999.99;
        boolean isFullTime=true;
        System.out.println("Name: "+ name + "\nLast name: " + lastName + "\nCompany: " + company +"\nJob title: " + job + "\nSuite: " + suite + "\nEmployee ID: " +employeeId + "\nNumber of PTO: " + numberOfPTO + "\nSalary: " + salary + "\nIs Mr.Al a full time employee: " + isFullTime );
    }
}
/*
create a class Employee
create a main method

    declare and assign these variables with the most appropriate datatypes:

        - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time

    declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - email (first name + employee id @ company name.com)
        - benefits (salary, number of PTO and add "work from home")

    create a summary of the information and print it. Be creative
        Example output: Employment information for James Bond. Secret Agent for MI6, based in suite C. Mr. Bond is full time: true. Contact Mr. Bond at James7@MI6.com. Current benefits include $1000000 salary a year, 20 PTO days and work from home.
 */
