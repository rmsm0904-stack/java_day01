import java.util.Scanner;

public class table_of_10 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number from 1 to 10: ");
            int number = input.nextInt();

            if (number >= 1 && number <= 10) {
                System.out.println("Multiplication table of " + number);
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + " x " + i + " = " + (number * i));
                }
            } else {
                System.out.println("Please enter a number between 1 and 10.");
            }
        }
    }
}
