package class17;

public class InstanceVariables {
    int number=10;
    void printNumber() {
        System.out.println(number);
        String name="Katya";
    }
    void printNumber2() {
        System.out.println(number);
        // System.out.println(name); CE
    }
    public static void main(String[] args) {

        InstanceVariables obj=new InstanceVariables();
        System.out.println(obj.number);

    }
}
