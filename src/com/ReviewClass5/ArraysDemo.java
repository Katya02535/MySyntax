package com.ReviewClass5;

public class ArraysDemo {
    public static void main(String[] args) {
        int num=10;
        String name="Alina";
        name="Katya";
        System.out.println(name);
        String [] names=new String [10];
        String names2[]=new String[10];
        names[0]="Alina";
        names[1]="Monika";
        names[2]="Azizi";

        int [][] numbers=new int[10][10];
        numbers[0][0]=12;
        numbers[0][1]=20;
        for (int i = 0; i <numbers.length; i++) {
            for (int j = 0; j <numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }


        int []numbers2[]=new int[10][]; //int numbers[][]=new int[][]



    }

}
