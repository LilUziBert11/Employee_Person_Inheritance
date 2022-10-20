/*
* Employee
*  Programmer: Albert Duenas
   Date: 10-18-22
   Version: 1.2
   Description: A java class that calculates the weekly salary of an employee./
 */
public class Employee extends Person{
    private int hours_worked;

    private double pay_rate;

    private double salary;

    //getters and setters
    public void setHours_worked(int hours_worked){this.hours_worked = hours_worked;}
    public int getHours_worked(){return hours_worked;}

    public void setPay_rate(double pay_rate){this.pay_rate = pay_rate;}
    public double getPay_rate(){return pay_rate;}

    public Employee(){
        super();
    }
    public Employee(String nm, char gn, String sn, int ag, int hrs, double r){
        super(nm,gn,sn,ag);
        hours_worked = hrs;
        pay_rate = r;
    }
    //calculating salary
    public double calcWeeklySalary(int h, double rate){
        salary = h*rate;
        return salary;
    }
}
