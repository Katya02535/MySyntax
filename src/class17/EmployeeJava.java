package class17;

public class EmployeeJava {
    String empID;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
         EmployeeJava obj1=new EmployeeJava();
         obj1.empID="123";
         obj1.salary=150000;
        System.out.println(obj1.empID+" salary "+obj1.salary+ " CEO "+obj1.CEO);

        EmployeeJava obj2=new EmployeeJava();
        obj2.empID="12345";
        obj2.salary=170000;
        System.out.println(obj2.empID+" salary "+obj2.salary+ " CEO "+obj2.CEO);

    }


}
