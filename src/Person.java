/*
* Person
*  Programmer: Albert Duenas
   Date: 10-18-22
   Version: 1.2
   Description: A java class that displays employee information ./
 */
public class Person {
    protected String name;
    protected char gender;
    protected String SSN;
    protected int age;

    //constructors
    public Person(){}
    public Person(String n, char g, String s, int age){
        name=n;
        gender=g;
        SSN=s;
        this.age=age;
    }
    //getters and setters
    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setGender(char gender){this.gender = gender;}
    public char getGender(){return gender;}

    public void setSSN(String SSN){this.SSN = SSN;}
    public String getSSN(){return SSN;}

    public void setAge(int age){this.age = age;}
    public int getAge(){return age;}
}
