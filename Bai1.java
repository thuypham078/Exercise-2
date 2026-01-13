package Exercise2;

import java.util.Random;

public class Bai1 {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        System.out.println(number);
    }
}
