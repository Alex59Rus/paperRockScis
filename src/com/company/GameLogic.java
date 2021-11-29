package com.company;
import java.util.Random;

public class GameLogic extends GameRunner {
    static String redirectAnswer = "";
    static int pointComputer = 0;
    static int pointPlayer = 0;
    static String[] arrayCount = {"Камень", "Бумага", "Ножницы"};
    static Random random = new Random();
    static int indexCompAnswer = random.nextInt(3);
    static {
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
    }

}
