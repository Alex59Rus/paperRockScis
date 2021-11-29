package com.company;
import java.util.Random;

public class GameLogic {
    static String redirectAnswer = "";
    static int pointComputer = 0;
    static int pointPlayer = 0;
    static String pointWord = "";
    static String pointWordCom = "";

    static String[] arrayCount = {"Камень", "Бумага", "Ножницы"};
    static Random random = new Random();
    static int indexCompAnswer = random.nextInt(3);

    {
        if (redirectAnswer == "Камень" && arrayCount[indexCompAnswer] == "Ножницы") {
            pointPlayer++;
        }
        if (redirectAnswer == "Камень" && arrayCount[indexCompAnswer] == "Бумага") {
            pointComputer++;
        }
        if (redirectAnswer == "Ножницы" && arrayCount[indexCompAnswer] == "Бумага") {
            pointPlayer++;
        }
        if (redirectAnswer == "Ножницы" && arrayCount[indexCompAnswer] == "Камень") {
            pointComputer++;
        }
        if (redirectAnswer == "Бумага" && arrayCount[indexCompAnswer] == "Камень") {
            pointPlayer++;
        }
        if (redirectAnswer == "Бумага" && arrayCount[indexCompAnswer] == "Ножницы") {
            pointComputer++;
        }
        if (pointComputer == 0) pointWordCom = " Очков";
        if (pointComputer == 1) pointWordCom = " Очко";
        if (pointComputer == 2 || pointComputer == 3) pointWordCom = " Очка";
        if (pointPlayer == 0) pointWord = " Очков";
        if (pointPlayer == 1) pointWord = " Очко";
        if (pointPlayer == 2 || pointPlayer == 3) pointWord = " Очка";

        if (pointComputer == 3) {
            System.out.println("Я Вас победил, Не расстраивайтесь! :)");
            System.out.println("Хотите сыграть ещё?");
            System.out.println();
            System.out.println("1. Да");
            System.out.println("2. Нет");
        }
        if (pointPlayer == 3) {
            System.out.println("Ваша заслуженная победа! Поздравляю!");
            System.out.println("Хотите сыграть ещё?");
            System.out.println();
            System.out.println("1. Да");
            System.out.println("2. Нет");
        }
    }
}

