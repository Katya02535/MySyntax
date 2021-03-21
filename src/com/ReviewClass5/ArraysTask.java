package com.ReviewClass5;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraysTask {
    public static void main(String[] args) {
        System.out.println("Enter how many numbers you want to add");
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        double[] numbers=new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter your number");
            numbers[i]=scan.nextDouble();

        }
        double sum=0;
        for (double number:numbers) {
            sum += number;
            System.out.println(sum);
        }
    }
}
