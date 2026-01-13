package Exercise2;

import java.util.Random;
import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1;
        int userNumber;
        int count = 0;

        do {
            System.out.print("Nhap so nguyen tu 1 den 10: ");
            userNumber = scanner.nextInt();
            count++;

            if (userNumber < randomNumber) {
                System.out.println("So ban nhap nho hon so ngau nhien.");
            } else if (userNumber > randomNumber) {
                System.out.println("So ban nhap lon hon so ngau nhien.");
            }

        } while (userNumber != randomNumber);

        System.out.println("Chinh xac! So ngau nhien la: " + randomNumber);
        System.out.println("Ban da thu " + count + " lan.");
    }
}
