import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your name: ");
        // String name = scanner.nextLine();

        // System.out.println("Enter your last name: ");
        // String lastName = scanner.nextLine();

        // System.out.println("Enter your age: ");
        // int age = scanner.nextInt();

        // System.out.println("Enter your height: ");
        // double height = scanner.nextDouble();

        // System.out.println("\n" + "=".repeat(60));
        // System.out.printf("%s %s is %d years old.%nYour height is %.2f.%n%n", name, lastName, age, height);

        // System.out.print("Enter the Purchase Description: ");
        // String description = sc.nextLine();

        // System.out.print("Enter the Credit Card limit: ");
        // double limit = sc.nextDouble();

        // System.out.print("Enter the Purchase Price: ");
        // double price = sc.nextDouble();

        // System.out.printf("Limit: %f - Description: %s - Price: %f", limit, description, price);


        // Tomada de decisões

        // System.out.println("Are you of legal age?");
        // boolean ehLegalAge = sc.nextBoolean();

        // System.out.println("What year were you birth");
        // int birthYear = sc.nextInt();

        // int age = LocalDate.now().getYear() - birthYear;

        // if (age >= 18) {
        //     System.out.println("Is of legal age.");
        // } else {
        //     System.out.println("Not of legal age.");
        // }

        System.out.println("How long is your course");
        int duration = sc.nextInt();

        if (duration > 2) {
            System.out.println("Bacharel");
        } else {
            System.out.println("Tecnólogo");
        }

    }
}
