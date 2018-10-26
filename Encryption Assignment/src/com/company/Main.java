package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);
        String userChoice;
        userChoice = userinput.nextLine();
        int x = 0;
        int y = 0;
        String completed = null;
        ArrayList encrypt = new ArrayList();
        ArrayList unencrypt = new ArrayList();
        while (x < userChoice.length()){
            char a = userChoice.charAt(x);
            x++;
            int n = (int) a;
            encrypt.add(n);
        }
        System.out.println(encrypt);

        while(y < encrypt.size()){
            Object num = encrypt.get(y);
            String n = Character.toString((char)(int)num);
            unencrypt.add(n);
            y++;
        }
        System.out.println(completed);









    }
}
