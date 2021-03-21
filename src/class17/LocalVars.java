package class17;

public class LocalVars {
    double salary=120000;

    void printInfo() {
        String name="Katya";
        System.out.println(name+" "+salary);
        System.out.println("Hi");
    }
    void printSalaryPlusBonus() {
        double bonus=50000;
        System.out.println(salary+bonus);
    }

    public static void main(String[] args) {
        LocalVars obj=new LocalVars();
        obj.printInfo();
        obj.printSalaryPlusBonus();
    }
}
