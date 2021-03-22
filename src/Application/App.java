package Application;

import Employee.Employee;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee("102","Yamir","Rodas",20,"i.am.yare@outlook.com");
        System.out.println("id:\t"+e1.getId());
        System.out.println("Employee:\t"+e1.getName()+" "+e1.getLastname());
        System.out.println("Ages:\t"+e1.getAge());
        System.out.println("email:\t"+e1.getEmail());
    }
}
