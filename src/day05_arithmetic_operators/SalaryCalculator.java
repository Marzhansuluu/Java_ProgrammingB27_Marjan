package day05_arithmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 100000;
        double stateTaxRate= 0.08;
        double federalTaxRate=0.21;
        double stateTax=salary * stateTaxRate;
        double federalTax= salary * federalTaxRate;
        System.out.println(" State tax total: \t$" + stateTax);
        System.out.println(" Federal tax total: $" + federalTax);
        String totalTaxAmount = " Total tax amount: \t$" + stateTax + federalTax;
        System.out.println(totalTaxAmount);
        double remainAmount=salary - stateTax - federalTax;
        String salaryAfterTax= "Salary after tax: \t$" + remainAmount;
        System.out.println(salaryAfterTax);
        /*  create a class SalaryCalculator
    add a main method
    declare and assign these variables:
       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
    Sample data:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)
    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes.
         */
    }
}
