package org.example;
import java.util.*;
class Employee{
   String name;
   double salary;
   double experience;
   Employee(String name, double salary,double experience){
       this.name=name;
       this.salary=salary;
       this.experience=experience;
   }
}
class Manager extends Employee
{
String department;
int teamSize;
Manager(String name, double salary,String department,int teamSize,double experience)
{
    super(name,salary,experience);
    this.department=department;
    this.teamSize=teamSize;
}
void details(){
    System.out.println("Employee name: "+name);
    System.out.println("Salary: " + salary);
    System.out.println("Department: " + department);
    System.out.println("Experience: " + experience);
    System.out.println("teamsize: " + teamSize);

}
}
public class Oops{
    public static void main(String Args[]){
      //Empolyee emp=new Employee();
      Manager m=new Manager("Hepsibah",70000,"QA Automation",5,4.5);
      m.details();
    }
}