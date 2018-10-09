package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Rock, Paper, Scissors");
        Scanner userInput = new Scanner(System.in);
        Random generator = new Random();
        //user choice input
        String userChoice = userInput.nextLine();
        //Randomly generates number for computer
        int generatorNum = generator.nextInt(3);
        String computerChoice = null;
        //Computer's generated choices (1,2,3)
        if (generatorNum == 1){
            computerChoice = "Rock";
        } else if (generatorNum == 2){
            computerChoice = "Paper";
        } else if (generatorNum == 3){
            computerChoice = "Scissors";
        }
        //Decides who wins
        //Prints computer and player choice
        if (userChoice == computerChoice){
            System.out.println("Tie, you both choose " + userChoice);
        } else if (userChoice.equals("Rock") && computerChoice.equals("Paper")){
            System.out.println("You lost, computer won with " + computerChoice);
        } else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")){
            System.out.println("You won, you beat Scissors with " + userChoice);
        } else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")){
            System.out.println("You won, you beat Paper with " + userChoice);
        } else if (userChoice.equals("Scissors") && computerChoice.equals("Rock")){
            System.out.println("You lost, computer won with " + computerChoice);
        } else if (userChoice.equals("Paper") && computerChoice.equals("Rock")){
            System.out.println("You won, you beat Rock with " + userChoice);
        } else if (userChoice.equals("Paper") && computerChoice.equals("Scissors")) {
            System.out.println("You lost, computer won with " + computerChoice);
        }


        }
    }