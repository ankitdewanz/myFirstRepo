package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.Random;

public class CWH_20_Ex2_RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        // Played with computer. Rock beats scissor | Scissor beats paper | paper beats rock
        //int i = new Random().ints(1,3);
        //System.out.println(i);
        int computerSelection = ran.nextInt(1,4);
        boolean b = true;
        int playerSelection=1;
        byte draw = 0;
        byte playerWin = 0;
        byte computeWin = 0;
        byte invalid=0;
        int i=0;
        while (i < 5){
            System.out.println("Player selection for " + (i + 1) + "Game");
            System.out.println("Select 1 for Paper , 2 for scissor andn 3 for rock:");
            playerSelection = sc.nextInt();
            b=true;
            while (b) {
                if (playerSelection > 3 || playerSelection < 1) {
                    System.out.println("Invalid selection! This game is invalid.");
                    invalid +=1;
                    b = false;
                } else {
                    System.out.println("Valid Selection!");
                    b = false;
                }
            }
            if (playerSelection == computerSelection) {
                System.out.println("The" + (i + 1) + "game is draw.");
                draw += 1;
            } else if ((playerSelection == 1 && computerSelection == 2) || (playerSelection == 2 && computerSelection == 3)
                    || (playerSelection == 3 && computerSelection == 1)) {
                computeWin += 1;
            } else if ((playerSelection == 3 && computerSelection == 2) || (playerSelection == 1 && computerSelection == 3)
                    || (playerSelection == 2 && computerSelection == 1)) {
                playerWin += 1;
            }
            System.out.println("Player:"+playerSelection+"| Computer"+computerSelection);
        i++;
        }
        System.out.println("Final Score: Draw"+draw+" | PlayerWin:"+playerWin+ " | ComputerWin:"+computeWin+ "" +
                "| Invalid Player Selection:"+ invalid);
    }
}