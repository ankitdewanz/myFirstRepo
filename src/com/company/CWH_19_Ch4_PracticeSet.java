package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CWH_19_Ch4_PracticeSet {
    public static void main(String[] args) {
//        //Problem 2 - Check if student pass if it requires total 40% and at least 33% in each subject to pass.
//        //Total Subjects = 3. Input marks from the user.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks out of 100 in each subject:");
//        //int sub1 = sc.nextInt();
//        //int sub2 = sc.nextInt();
//        //int sub3 = sc.nextInt();
//        //int total = (sub1 + sub2 + sub3 )/3;
//        //Correction - 1. when marks are out of 100 use byte.
//        //Correction - 2. average should be a float
//        byte sub1 = sc.nextByte();
//        byte sub2 = sc.nextByte();
//        byte sub3 = sc.nextByte();
//        float avg = (sub1 + sub2 + sub3)/3.0f;
//        if  (sub1 >100 || sub2>100||sub3>100){
//            System.out.println("Marks in any subject cannot be greater than 100");
//        } else if (avg <40 && (sub1 < 33 || sub2 < 33 || sub3 < 33)){
//            System.out.println("You fail as total is less than 40 and marks in one or more subject is less than 33");
//        }else if (avg <40 && (sub1 >= 33 && sub2 >= 33 && sub3 >= 33)) {
//            System.out.println("You fail as total marks is less than 40.");
//        }else if ((avg >40) && (sub1 < 33 || sub2 < 33 || sub3 < 33)){
//            System.out.println("You fail as marked in any one or more subject is less than 33");
//        }else{
//            System.out.println("Congratulations! You pass.Your total score is "+avg);
//        }
//        System.out.println(sub1+" "+sub2+" "+sub3+" "+avg);

        // Problem 3 Calculate income tax. Tax Slab 2.5l to 5.0l 5% | 5.0l to 10.0l 20% | above 10.0l 30% |
        // no tax < 2.5l | Salary input from user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your salary");
//        int sal = sc.nextInt();
//        float tax = 0.0f;
//        if (sal <= 250000){
//            tax = 0.0f;
//        }
//        else if (sal > 250000 && sal <= 500000){
//            tax = tax + (sal-250000.0f) * 0.05f;
//        }
//        else if (sal >500000 && sal <=1000000){
//            tax = tax + (sal - 500000.0f) *0.20f + 250000*0.05f;
//        }
//        else if (sal > 1000000){
//            tax = tax + (sal - 1000000.0f) * 0.30f + 500000*0.2f + 250000*0.05f;
//        }
//        System.out.println("Total tax on a sal of "+sal+" is :"+tax);
    //Problem 5 : Leap Year
        Scanner sc = new Scanner(System.in);
        short year = sc.nextShort();
        boolean isLeapYear ;
        isLeapYear = (year%4==0);
        isLeapYear = (year%400==0);

        if (year %400 ==0){
            System.out.println("its a leap year!");
        }
        else if (year%100==0 ){
            System.out.println("its not a leap year!");
        }
        else if (year%4==0){
            System.out.println("its a leap year!");
        }else{
            System.out.println("Its not a leap year!");
        }

    }



}
