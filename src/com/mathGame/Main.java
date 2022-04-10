package com.mathGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Math Command Line Game");

        int min = 1;
        int max = 200;

        Scanner answerScanner = new Scanner(System.in); // Create a Scanner object

        int x = generateRandomValue(min, max);
        int y = generateRandomValue(min, max);

        System.out.println("What is " + x + " + " + y + " ?");
        int answer = answerScanner.nextInt(); // Read user input
        answerScanner.close();
        System.out.println("You said " + answer);
        System.out.println(answer == addTwoNumbers(x, y) ? "You are correct!" : "Incorrect!");
    }

    public static int generateRandomValue(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static int addTwoNumbers(int x, int y) {
        return x + y;
    }

}
