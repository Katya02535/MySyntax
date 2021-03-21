package com.ReviewClass5;

public class EmployeeTester {
    public static void main(String[] args) {
        Employees obj=new Employees();
        obj.id="123";
        obj.name="Katya";
        obj.department="IT";
        obj.salary=180000;
        Employees objNext=new Employees();
        objNext.id="567";
        objNext.name="John";
        objNext.department="IT";
        objNext.salary=135000;

        Employees[] employees=new Employees[2];
        employees[0]=obj;
        employees[1]=objNext;

        for (int i = 0; i < employees.length ; i++) { //for (Employees employee:employees)
            System.out.println(employees[i].id);
            System.out.println(employees[i].name);
            System.out.println(employees[i].department);
            System.out.println(employees[i].salary);
        employees[i].work();
        employees[i].drink();
        }

    }


}
