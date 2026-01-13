package Exercise2;

import java.util.Random;

public class Bai2 {

    public static void main(String[] args) {
        double min = 1.8;
        double max = 8.0;

        Random rand = new Random();
        double randomValue = min + rand.nextDouble() * (max - min);

        System.out.printf("%.2f", randomValue);
    }
}
