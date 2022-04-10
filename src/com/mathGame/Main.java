package com.mathGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Math Command Line Game");

        int min = 1;
        int max = 10;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("How many turns would you like to play?");
        int turnCount = inputScanner.nextInt();

        for (int i = 0; i <= turnCount - 1; i++) {

            int x = generateRandomValue(min, max);
            int y = generateRandomValue(min, max);
            int additionAnswer = addTwoNumbers(x, y);

            String questionType = chooseQuestionType();

            if (questionType == "add") {
                System.out.println("What is " + x + " + " + y + " ?");
                int answer = inputScanner.nextInt();
                printAnswerCheck(answer == additionAnswer);
            }
            if (questionType == "subtract") {
                System.out.println("What is " + additionAnswer + " - " + x + " ?");
                int answer = inputScanner.nextInt();
                printAnswerCheck(answer == y);
            }

        }
        inputScanner.close();

    }

    private static String chooseQuestionType() {
        int randomValue = generateRandomValue(0, 1);
        if (randomValue == 0) {
            return "add";
        }
        if (randomValue == 1) {
            return "subtract";
        }
        return null;
    }

    private static void printAnswerCheck(boolean checker) {
        String isCorrectMessage = "You are correct!";
        String isIncorrectMessage = "You are incorrect!";
        System.out.println(checker ? isCorrectMessage : isIncorrectMessage);
    }

    private static int generateRandomValue(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    private static int addTwoNumbers(int x, int y) {
        return x + y;
    }

}
