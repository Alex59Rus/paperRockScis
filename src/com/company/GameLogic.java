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
        if (GameLogic.redirectAnswer == "Камень" && GameLogic.arrayCount[GameLogic.indexCompAnswer] == "Ножницы") {
            GameLogic.pointPlayer++;
        }
        if (GameLogic.redirectAnswer == "Камень" && GameLogic.arrayCount[GameLogic.indexCompAnswer] == "Бумага") {
            GameLogic.pointComputer++;
        }
        if (GameLogic.redirectAnswer == "Ножницы" && GameLogic.arrayCount[GameLogic.indexCompAnswer] == "Бумага") {
            GameLogic.pointPlayer++;
        }
        if (GameLogic.redirectAnswer == "Ножницы" && GameLogic.arrayCount[GameLogic.indexCompAnswer] == "Камень") {
            GameLogic.pointComputer++;
        }
        if (GameLogic.redirectAnswer == "Бумага" && GameLogic.arrayCount[GameLogic.indexCompAnswer] == "Камень") {
            GameLogic.pointPlayer++;
        }
        if (GameLogic.redirectAnswer == "Бумага" && GameLogic.arrayCount[GameLogic.indexCompAnswer] == "Ножницы") {
            GameLogic.pointComputer++;
        }
        {
            if (GameLogic.pointComputer == 0) GameLogic.pointWordCom = " Очков";
            if (GameLogic.pointComputer == 1) GameLogic.pointWordCom = " Очко";
            if (GameLogic.pointComputer == 2 || GameLogic.pointComputer == 3) GameLogic.pointWordCom = " Очка";
            if (GameLogic.pointPlayer == 0) GameLogic.pointWord = " Очков";
            if (GameLogic.pointPlayer == 1) GameLogic.pointWord = " Очко";
            if (GameLogic.pointPlayer == 2 || GameLogic.pointPlayer == 3) GameLogic.pointWord = " Очка";
        }
        if (GameLogic.pointComputer == 3) {
            System.out.println("Я Вас победил, Не расстраивайтесь! :)");
            System.out.println("Хотите сыграть ещё?");
            System.out.println();
            System.out.println("1. Да");
            System.out.println("2. Нет");
        }
        if (GameLogic.pointPlayer == 3) {
            System.out.println("Ваша заслуженная победа! Поздравляю!");
            System.out.println("Хотите сыграть ещё?");
            System.out.println();
            System.out.println("1. Да");
            System.out.println("2. Нет");
        }
    }
}

