package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Rock, Paper, Scissors");
        Scanner userInput = new Scanner(System.in);
        Random generator = new Random();
        String userChoice = userInput.nextLine();
        int generatorNum = generator.nextInt(3);
        String computerChoice = null;

        if (generatorNum == 1){
            computerChoice = "Rock";
        }if (generatorNum == 2){
            computerChoice = "Paper";
        }if (generatorNum == 3){
            computerChoice = "Scissors";
        }

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