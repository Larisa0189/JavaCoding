package loops;

import java.util.Random;

public class DiceGame {

    public static void main(String[] args) {

        Random randomNumber = new Random();
        int dice1;
        int dice2;
        int dice3;
        int count = 0;

        do {
            count++;
            dice1 = randomNumber.nextInt(1, 7);
            dice2 = randomNumber.nextInt(1, 7);
            dice3 = randomNumber.nextInt(1, 7);
            System.out.println("zarul unu este: " + dice1 + " si zarul doi este " + dice2 + " si zarul trei este " + dice3);
        } while (!(dice1 == dice2 && dice2 == dice3));

        System.out.println("Ai aruncat zarul de " + count + " ori");
        System.out.println("finish");
    }
}
