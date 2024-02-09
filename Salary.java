public class Salary {
    private double salary;
    private int hours;
    

public Salary(){
    salary = 15;
    hours = 8;
}
public Salary(int h, double s){
    salary = s;
    hours = h;
}
public double getSalary(){
    return salary;
}
public int getHours(){
    return hours;
}
public void setSalary(double s){
    salary = s;
}
public void setHours(int h){
    hours  = h;
}
public String toString(){
    return "\nSalary: " + "$" +salary +"/hour"+ "\nHours worked: " +hours;
}
}