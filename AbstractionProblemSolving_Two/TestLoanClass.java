package AbstractionProblemSolving_Two;

import java.util.Scanner;

/*The Loan class contains two constructors, four getter methods, three setter methods,
and the methods for finding the monthly payment and the total payment.
You can construct a Loan object by using the no-arg constructor or the constructor with
three parameters: annual interest rate, number of years, and loan amount.
When a loan object is created,  its date is stored in the loanDate field.
The getLoanDate method returns the date.
 The  methods—getAnnualInterest, getNumberOfYears, and getLoanAmount—
 return the  annual interest rate, payment years, and loan amount, respectively.
All the data properties  and methods in this class are tied to a specific instance of the Loan class.
Therefore, they are  instance variables and methods. */

public class TestLoanClass {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the annual Interest Rate: ");
        double annualInterest= sc.nextDouble();

        System.out.println("Enter the number of years: ");
        int numberOfyears=sc.nextInt();

        System.out.println("Enter the loan amount: ");
        double loanAmount=sc.nextDouble();

        loan l1=new loan(annualInterest,numberOfyears,loanAmount);
        System.out.println("The loan was created on "+l1.getLoandate().toString());
        System.out.println("The Monthly payment is "+l1.getMonthlyPayments());
        System.out.println("The Total Payment is "+l1.getTotalPayments());
    }
}
