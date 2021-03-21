package class18;

public class tylesOfVars {

    String name;
    static String CompanyName="Syntax";

    void printInfo() {
        System.out.println(name+" Company "+CompanyName);
    }

    static void printCompanyInfo() {
        //sout (name) CE
        System.out.println(CompanyName);

    }
    public static void main(String[] args) {
        tylesOfVars obj1=new tylesOfVars();
        obj1.name="Katya";

        tylesOfVars obj2=new tylesOfVars();
        obj2.name="Katyusha";
    }
}
