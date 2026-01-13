package Exercise2;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thuc tu 1 den 100: ");
        double userNumber = scanner.nextDouble();

        double randomNumber = 1.0 + Math.random() * (100.0 - 1.0);

        System.out.println("So ngau nhien: " + randomNumber);

        if (userNumber > randomNumber) {
            System.out.println("So ban nhap lon hon so ngau nhien.");
        } else if (userNumber < randomNumber) {
            System.out.println("So ban nhap nho hon so ngau nhien.");
        } else {
            System.out.println("Hai so bang nhau.");
        }
    }
}
