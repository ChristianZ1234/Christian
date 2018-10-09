package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random generator = new Random();
        String userChoice;
        //Keeps track of computer wins
        int computerWins = 0;
        //Keeps track of user wins
        int userWins = 0;
        //Keeps track of ties
        int tie = 0;

        do {

            System.out.println("Rock,Paper,Scissors");
            //Scoreboard
            System.out.println();
            System.out.println("Wins:" + userWins + "\tLosses:" + computerWins + "\tTies:" + tie);
            System.out.println("-----------------------------------------------------------------");
            //user selection
            userChoice = userInput.nextLine().toLowerCase();
            //Randomly generates number for computer
            int generatorNum = generator.nextInt(3);
            String computerChoice = null;
            //Computer's generated choices (0,1,2)
            if (generatorNum == 0) {
                computerChoice = "rock";
            } else if (generatorNum == 1) {
                computerChoice = "paper";
            } else if (generatorNum == 2) {
                computerChoice = "scissors";
            }
            //Corrects misspelled input
            if(!userChoice.equals("rock")&&(!userChoice.equals("paper")&&(!userChoice.equals("scissors")&&(!userChoice.equals("exit"))))){
                System.out.println("Please Type: rock, paper, scissors, or exit");
            }
            System.out.println();
            //Decides who wins
            //Prints out computer and player choice
            if (userChoice.equals(computerChoice)) {
                System.out.println("Tie, you both choose " + userChoice);
                tie++;
            } else if (userChoice.equals("rock") && computerChoice.equals("paper")) {
                System.out.println("You lost, computer won with " + computerChoice);
                computerWins++;
            } else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("You won, you beat scissors with " + userChoice);
                userWins++;
            } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You won, you beat paper with " + userChoice);
                userWins++;
            } else if (userChoice.equals("scissors") && computerChoice.equals("rock")) {
                System.out.println("You lost, computer won with " + computerChoice);
                computerWins++;
            } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You won, you beat rock with " + userChoice);
                userWins++;
            } else if (userChoice.equals("paper") && computerChoice.equals("scissors")) {
                System.out.println("You lost, computer won with " + computerChoice);
                computerWins++;
            }
        //exit command
        }while(!userChoice.equals("exit"));
    }
}