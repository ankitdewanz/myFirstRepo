package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class CWH_01Excercise_CBSEExam {
    public static void main(String[] args) {
        System.out.println("Enter the marks in 5 subjects:");
        Scanner marks = new Scanner(System.in);
        float a = marks.nextFloat();
        float b = marks.nextFloat();
        float c = marks.nextFloat();
        float d = marks.nextFloat();
        float e = marks.nextFloat();
//        int b = marks.nextInt();
//        int c = marks.nextInt();
//        int d = marks.nextInt();
//        int e = marks.nextInt();
        float percentage = (a+b+c+d+e)/5;
        System.out.println("Percentage of the student is:"+percentage+"%");
    }
}
