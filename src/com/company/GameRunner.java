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
        System.out.println("Привет," + player + " меня зовут " + Field.comPlayer[index] + ".");
        System.out.println("Хочешь сыграть в игру Камень-Ножницы-Бумага?");
        System.out.println();
        System.out.println("1. Да");
        System.out.println("2. Нет");
        Scanner variants = new Scanner(System.in);
        int chose = variants.nextInt();
        while (true) {
            if (chose == 1) {
                System.out.println("Отлично! Начинаем!");
                System.out.println();
                break;
            }
            if (chose == 2) {
                System.out.println("Жаль, попробуем в другой раз!");
                break;
            }
            System.out.println("Я Вас не понял. Нажмите цифру 1 или 2, пожалуйста");
            chose = variants.nextInt();
        }
        int i;
        for (i = 0; i < 9; i++) System.out.println(rule[i]);
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println("Готовы? (нажмите 1, если да)");
        Scanner ready = new Scanner(System.in);
        int readyAnsw = ready.nextInt();
        if (readyAnsw == 1) {
            System.out.println("Поехали!");
            TimeUnit.SECONDS.sleep(1);
            while (GameLogic.pointPlayer < 3 && GameLogic.pointComputer < 3) {
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
                int answerOne = gameOne.nextInt();
                if (answerOne == 1) GameLogic.redirectAnswer = "Камень";
                if (answerOne == 2) GameLogic.redirectAnswer = "Ножницы";
                if (answerOne == 3) GameLogic.redirectAnswer = "Бумага";
                    if (GameLogic.redirectAnswer.equals(GameLogic.arrayCount[GameLogic.indexCompAnswer])) {
                        System.out.println(player + ": " + GameLogic.redirectAnswer + " | " + Field.comPlayer[index] + ": " + GameLogic.arrayCount[GameLogic.indexCompAnswer] + "   !НИЧЬЯ!");
                        System.out.println(player + ": " + GameLogic.pointPlayer + GameLogic.pointWord);
                        System.out.println(Field.comPlayer[index] + ": " + GameLogic.pointComputer + GameLogic.pointWordCom);
                        System.out.println();
                    } else {
                        System.out.println(player + ": " + GameLogic.redirectAnswer + " | " + Field.comPlayer[index] + ": " + GameLogic.arrayCount[GameLogic.indexCompAnswer]);
                        System.out.println(player + ": " + GameLogic.pointPlayer + GameLogic.pointWord);
                        System.out.println(Field.comPlayer[index] + ": " + GameLogic.pointComputer + GameLogic.pointWordCom);
                        System.out.println();
                    }
                }
            }
        }
    }

