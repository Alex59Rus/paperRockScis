package com.company;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private final Field field = new Field();
    private static final String ROCK = "Камень";
    private static final String SCISSORS = "Ножницы";
    private static final String PAPER = "Бумага";
    private final Scanner scanner = new Scanner(System.in);
    final Random random = new Random();


    public void start() {
        String userInput = null;
        while (userInput == null) {
            userInput = getUserInput();
        }
        String pcInput = null;
        while (pcInput == null) {
            pcInput = generatePcInput();
        }
        field.setPlayerFigure(userInput);
        field.setBotFigure(pcInput);
        System.out.println(checkWinner());
    }

    public String getUserInput() {
        System.out.println("Введите ваш выбор ");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                return ROCK;
            case 2:
                return SCISSORS;
            case 3:
                return PAPER;
            default:
                return null;
        }
    }
    public String generatePcInput() {
        int pcInput = random.nextInt(3);
        return switch (pcInput) {
            case 1 -> ROCK;
            case 2 -> SCISSORS;
            case 3 -> PAPER;
            default -> null;
        };
    }
    public String checkWinner() {
        if (field.getPlayerFigure() == ROCK && field.getBotFigure() == SCISSORS) {
            System.out.println(field.getPlayerFigure());
            System.out.println(field.getBotFigure());
            return " Игрок выиграл ";
        }
        if (field.getPlayerFigure() == ROCK && field.getBotFigure() == PAPER) {
            System.out.println(field.getPlayerFigure());
            System.out.println(field.getBotFigure());
            return " Компьютер выиграл ";
        }
        if (field.getPlayerFigure() == PAPER && field.getBotFigure() == SCISSORS) {
            System.out.println(field.getPlayerFigure());
            System.out.println(field.getBotFigure());
            return " Компьютер выиграл ";
        }
        if (field.getPlayerFigure() == PAPER && field.getBotFigure() == ROCK) {
            System.out.println(field.getPlayerFigure());
            System.out.println(field.getBotFigure());
            return " Игрок выиграл ";
        }
        if (field.getPlayerFigure() == SCISSORS && field.getBotFigure() == PAPER) {
            System.out.println(field.getPlayerFigure());
            System.out.println(field.getBotFigure());
            return " Игрок выиграл ";
        }
        if (field.getPlayerFigure() == SCISSORS && field.getBotFigure() == ROCK) {
            System.out.println(field.getPlayerFigure());
            System.out.println(field.getBotFigure());
            return " Компьютер выиграл ";
        }else {
            System.out.println(field.getPlayerFigure());
            System.out.println(field.getBotFigure());
            return " НИЧЬЯ! ";
        }

    }
}

