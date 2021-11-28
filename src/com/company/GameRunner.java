package com.company;
import com.sun.source.tree.BreakTree;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GameRunner {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        String[] comPlayer = {"Stan", "John", "Simon", "Holy", "Polly"};
        int index = random.nextInt(4);
        String comGamer = "John";
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
        String[] rule = {
                "ПРАВИЛА ИГРЫ:",
                "Игроки считают «Аль… ман… джуз!» вместе вслух, одновременно качая головой.",
                "На счёт «Джуз!» одновременно нажимают на кнопку одного из трёх знаков: камень, ножницы или бумагу.",
                "Победитель определяется по следующим правилам:",
                "Бумага побеждает камень («бумага обёртывает камень»).",
                "Камень побеждает ножницы («камень затупляет или ломает ножницы»).",
                "Ножницы побеждают бумагу («ножницы разрезают бумагу»).",
                "Если игроки показали одинаковый знак, то засчитывается ничья и игра переигрывается.",
                "Играем до трёх побед!"
        };

        int i;
        for (i = 0; i < 9; i++) {
            System.out.println(rule[i]);
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println();
        System.out.println("Готовы? (нажмите 1, если да)");
        Scanner ready = new Scanner(System.in);
        int readyAnsw = variants.nextInt();
            if (chose == 1) {
                System.out.println("Поехали!");
                TimeUnit.SECONDS.sleep(2);
                int pointComputer = 0;
                int pointPlayer = 0;
                while (pointPlayer < 3 && pointComputer < 3) {
                System.out.println("Аль...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Ман...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Джуз!...");
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Выберите Ваш ответ!");
                    System.out.println();
                System.out.println("1. Камень");
                System.out.println("2. Ножницы");
                System.out.println("3. Бумага");
                Scanner gameOne = new Scanner(System.in);
                int answerOne = variants.nextInt();
                String redirectAnswer = "";
                if (answerOne == 1) {
                    redirectAnswer = "Камень";
                }
                if (answerOne == 2) {
                    redirectAnswer = "Ножницы";
                }
                if (answerOne == 3) {
                    redirectAnswer = "Бумага";
                }
                String[] arrayCount = {"Камень", "Бумага", "Ножницы"};
                int indexCompAnswer = random.nextInt(3);
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
                    String pointWord = "";
                    String pointWordCom = "";

                    if (pointComputer == 0) {
                        pointWordCom = " Очков";
                    }
                    if (pointComputer == 1) {
                        pointWordCom = " Очко";
                    }
                    if (pointComputer == 2 || pointComputer == 3) {
                        pointWordCom = " Очка";
                    }
                    if (pointPlayer == 0) {
                        pointWord = " Очков";
                    }
                    if (pointPlayer == 1) {
                        pointWord = " Очко";
                    }
                    if (pointPlayer == 2 || pointPlayer == 3) {
                        pointWord = " Очка";
                    }
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
                    int again = variants.nextInt();
                    while (again != 1 || again != 2 || again > 2) {
                        if (again == 1) {
                            System.out.println("Отлично! Начинаем!");
                            System.out.println();
                            break;
                        }
                        if (again == 2) {
                            System.out.println("Жаль, попробуем в другой раз!");
                            break;
                        }
                        if (again != 1 && again != 2) {
                            System.out.println("Я Вас не понял. Нажмите цифру 1 или 2, пожалуйста");
                            again = variants.nextInt();
                        }
                    }
                }
                if (pointPlayer == 3) {
                    System.out.println("Ваша заслуженная победа! Поздравляю!");
                    System.out.println("Хотите сыграть ещё?");
                    System.out.println();
                    System.out.println("1. Да");
                    System.out.println("2. Нет");
                    int again = variants.nextInt();
                    while (again != 1 || again != 2 || again > 2) {
                        if (again == 1) {
                            System.out.println("Отлично! Начинаем!");
                            System.out.println();
                            break;
                        }
                        if (again == 2) {
                            System.out.println("Жаль, попробуем в другой раз!");
                            break;
                        }
                        if (again != 1 && again != 2) {
                            System.out.println("Я Вас не понял. Нажмите цифру 1 или 2, пожалуйста");
                            again = variants.nextInt();
                        }
                    }
                }
            }
    }
}

