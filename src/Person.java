public class Employee {
    protected String name;
    protected String gender;
    protected String SSN;

    //constructors
    public Employee(){}
    public Employee(String n, String g, String s){
        name=n;
        gender=g;
        SSN=s;
    }
    //getters and setters
    public void setName(String name){}
    public String getName(){return name;}

    public void setGender(String gender;){}
    public String getGender(){return gender;}

    public void setSSN(String SSN;){}
    public String getSSN(){return SSN;}
}
