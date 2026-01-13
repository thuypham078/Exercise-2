package Exercise2;

import java.util.Random;
import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Toi da chon 1 so tu 1 den 100. Hay doan!");

        while (true) {
            System.out.print("Nhap so ban doan: ");
            guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Chuc mung! Ban da doan dung!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("So can tim lon hon so ban doan.");
            } else {
                System.out.println("So can tim nho hon so ban doan.");
            }
        }
    }
}
