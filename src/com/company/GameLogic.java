package com.company;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private final Field field = new Field();
    private static final String ROCK = "Камень";
    private static final String SCISSORS = "Ножницы";
    private static final String PAPER = "Бумага";
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    int pointPlayer = 0;
    int pointComputer = 0;


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
        System.out.println(pointComputer);
    }
    public String getUserInput() {
        System.out.println("Введите ваш выбор ");
        int input = scanner.nextInt();

        return switch (input) {
            case 1 -> ROCK;
            case 2 -> SCISSORS;
            case 3 -> PAPER;
            default -> null;
        };
    }
    public String generatePcInput() {

        int pcInput = Math.random() * 3;
        return switch (pcInput) {
            case 1 -> ROCK;
            case 2 -> SCISSORS;
            case 3 -> PAPER;
            default -> null;
        };
    }
    public String checkWinner() {
        if (getUserInput() == ROCK && generatePcInput() == SCISSORS) {
            pointPlayer++;
        }
        if (getUserInput() == ROCK && generatePcInput() == PAPER) {
            pointComputer++;
        }
        if (getUserInput() == PAPER && generatePcInput() == SCISSORS) {
            pointComputer++;
        }
        if (getUserInput() == PAPER && generatePcInput() == ROCK) {
            pointPlayer++;
        }
        if (getUserInput() == SCISSORS && generatePcInput() == PAPER) {
            pointPlayer++;
        }
        if (getUserInput() == SCISSORS && generatePcInput() == ROCK) {
            pointComputer++;
        }
        if (getUserInput() == generatePcInput()) {
            return " НИЧЬЯ! ";
        }
    }
}