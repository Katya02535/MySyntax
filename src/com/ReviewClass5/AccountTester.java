package com.ReviewClass5;

import java.util.Scanner;

public class AccountTester {
    public static void main(String[] args) {
        Account KatyaAcc=new Account();
        KatyaAcc.signUp();
        boolean isSuccessful=KatyaAcc.signIn();
        if (isSuccessful){
            System.out.println("Enter transfer amount");
            Scanner scan=new Scanner(System.in);

            KatyaAcc.withDraw(scan.nextDouble());
        }
    }

}
