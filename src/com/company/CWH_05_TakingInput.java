package com.company;
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int a = sc.nextInt();
        System.out.println("Enter second integer:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of "+a+" and "+b+" is "+sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }

}
