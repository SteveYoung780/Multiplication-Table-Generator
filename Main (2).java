import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number to print its multiplication table:");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {

            int result = number * i;

            System.out.println(number + " x " + i + " = " + result);
        }

        scanner.close();
    }
}