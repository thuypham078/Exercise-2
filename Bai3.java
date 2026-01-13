package Exercise2;

import java.util.Random;

public class Bai3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(80 - 3 + 1) + 3;
        System.out.println("So duoc chon: " + number);

        if (number % 2 == 0) {
            System.out.println(number + " la so chan");
        } else {
            System.out.println(number + " la so le");
        }
    }
}
