package com.ReviewClass5;


import java.util.Scanner;

public class Account {
    String uName;
    String password;
    double balance;
    void signUp() {
        System.out.println("welcome");
        System.out.println("choose your name");
        Scanner scanner=new Scanner(System.in);
        uName=scanner.next();
        System.out.println("please choose password");
        password=scanner.next();
        System.out.println("enter deposit");
        balance=scanner.nextDouble();

    }
    boolean signIn() {
        System.out.println("Please enter your user name");
        Scanner scan = new Scanner(System.in);
        String enteredUname = scan.next();
        System.out.println("Please enter your password");
        String enteredPW = scan.next();
        if (enteredUname.equals(uName) && enteredPW.equals(password)) {
            System.out.println("Welcome to the bank");
            return true;
        } else {
            System.out.println("Invalid credentials");
            return false;

        }
    }
        void withDraw(double amountToWithdraw) {
            if (amountToWithdraw >balance) {
                System.out.println("Not enough balance");
            } else {
                balance=balance- amountToWithdraw;
                System.out.println("operation Successful");
            }

    }
}
