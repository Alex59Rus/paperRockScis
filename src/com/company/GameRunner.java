package com.company;
import com.sun.source.tree.BreakTree;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static com.company.Field.comPlayer;
import static com.company.Field.rule;
import static com.company.GameLogic.*;

public class GameRunner {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int index = random.nextInt(6);
        Scanner nameInput = new Scanner(System.in);
        System.out.print("Как Вас зовут? (введите имя ->) ");
        String player = nameInput.nextLine();
        System.out.println("Привет," + player + " меня зовут " + comPlayer[index] + ".");
        System.out.println("Хочешь сыграть в игру Камень-Ножницы-Бумага?");
        System.out.println();
        System.out.println("1. Да");
        System.out.println("2. Нет");
        Scanner variants = new Scanner(System.in);
        int chose = variants.nextInt();
        while (chose != 1 || chose != 2 || chose > 2) {
            if (chose == 1) {
                System.out.println("Отлично! Начинаем!");
                System.out.println();
                break;
            }
            if (chose == 2) {
                System.out.println("Жаль, попробуем в другой раз!");
                break;
            }
            if (chose != 1 && chose != 2) {
                System.out.println("Я Вас не понял. Нажмите цифру 1 или 2, пожалуйста");
                chose = variants.nextInt();
            }
        }
        int i;
        for (i = 0; i < 9; i++) System.out.println(rule[i]);
        TimeUnit.SECONDS.sleep(3);
        System.out.println();
        System.out.println("Готовы? (нажмите 1, если да)");
        Scanner ready = new Scanner(System.in);
        int readyAnsw = variants.nextInt();
            if (chose == 1) {
                System.out.println("Поехали!");
                TimeUnit.SECONDS.sleep(2);
                while (pointPlayer < 3 && pointComputer < 3) {
                System.out.println("Аль...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Ман...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Джуз!...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Выберите Ваш ответ!");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println();
                System.out.println("1. Камень");
                System.out.println("2. Ножницы");
                System.out.println("3. Бумага");
                Scanner gameOne = new Scanner(System.in);
                int answerOne = variants.nextInt();
                if (answerOne == 1) redirectAnswer = "Камень";
                if (answerOne == 2) redirectAnswer = "Ножницы";
                if (answerOne == 3) redirectAnswer = "Бумага";

                    String pointWord = "";
                    String pointWordCom = "";

                    if (pointComputer == 0) pointWordCom = " Очков";
                    if (pointComputer == 1) pointWordCom = " Очко";
                    if (pointComputer == 2 || pointComputer == 3) pointWordCom = " Очка";
                    if (pointPlayer == 0) pointWord = " Очков";
                    if (pointPlayer == 1) pointWord = " Очко";
                    if (pointPlayer == 2 || pointPlayer == 3) pointWord = " Очка";
                if (redirectAnswer.equals(arrayCount[indexCompAnswer])) {
                    System.out.println(player + ": " + redirectAnswer + " | " + comPlayer[index] + ": " + arrayCount[indexCompAnswer] + "   !НИЧЬЯ!");
                    System.out.println(player + ": " + pointPlayer + pointWord);
                    System.out.println(comPlayer[index] + ": " + pointComputer + pointWordCom);
                    System.out.println();
                } else {
                    System.out.println(player + ": " + redirectAnswer + " | " + comPlayer[index] + ": " + arrayCount[indexCompAnswer]);
                    System.out.println(player + ": " + pointPlayer + pointWord);
                    System.out.println(comPlayer[index] + ": " + pointComputer + pointWordCom);
                    System.out.println(); }
            }
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
}

