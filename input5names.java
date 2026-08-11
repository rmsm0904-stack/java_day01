import java.util.Scanner;

public class input5names {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] names = new String[5];

            System.out.println("Enter 5 names:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Name " + (i + 1) + ": ");
                names[i] = scanner.nextLine();
            }

            System.out.println("The 5 names entered are:");
            for (int i = 0; i < 5; i++) {
                System.out.println(names[i]);
            }
        }
    }
}
