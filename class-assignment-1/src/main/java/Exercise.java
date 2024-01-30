import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a food: ");
        String food1 = scanner.nextLine();
        System.out.println("Enter a food: ");
        String food2 = scanner.nextLine();
        if (food1.equals(food2)) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }
}

