package class18;

import java.util.Scanner;

public class AccessModifierTester {

    public static void main(String[] args) {
        AccessModifiers obj=new AccessModifiers();
       // System.out.println(obj.BankAccountPassword);
        System.out.println(obj.name);
        System.out.println(obj.SSN);
        Scanner scan=new Scanner(System.in);
        scan.next();
    }
}


