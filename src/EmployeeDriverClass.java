/*
* EmployeeDriverClass
*  Programmer: Albert Duenas
   Date: 10-18-22
   Version: 1.2
   Description: Driver class that asks the user for their input and displays the results./
 */
import java.util.Scanner;

public class EmployeeDriverClass {
    public static void main(String[] args){
        //Declaring new scanner class
        Scanner sc = new java.util.Scanner(System.in);

        //Asking the user for the value of age
        System.out.println("How old are you?");
        int age = sc.nextInt();

        //Asking the user for their SSN
        System.out.println("What is your SSN?");
        String SSN = sc.next();

        //Asking the user for their gender
        System.out.println("What is your gender? (m/f)");
        char gender = sc.next().charAt(0);

        //Asking the user for their name
        System.out.println("What is your name?");
        String name = sc.next();

        //Asking the user for their hours worked
        System.out.println("How many hours have you worked?");
        int hrs = sc.nextInt();

        //Asking the user for their pay rate
        System.out.println("What is your pay rate?");
        double r = sc.nextDouble();

        //displaying results
        Employee e = new Employee (name, gender, SSN, age, hrs, r);
        System.out.println("Employee's name is: "+e.getName());
        System.out.format("Employee's age is: %d\r\n",e.getAge());
        System.out.println("Employee's SSN is: "+e.getSSN());
        System.out.println("Employee's gender is: "+e.getGender());
        System.out.format("Hours employee has worked are: %d\r\n", e.getHours_worked());
        System.out.format("Employee's pay rate is: %.2f\r\r", e.getPay_rate());
        System.out.format("Employee's weekly salary is: %.2f\r\n", e.calcWeeklySalary(e.getHours_worked(), e.getPay_rate()));
    }
}
