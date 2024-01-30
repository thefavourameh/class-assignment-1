import java.util.Random;
import java.util.Scanner;

public class switchmethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.next();
        System.out.println("Hello " + name + "! Welcome to your Mathematics Skill Test");
    Random random = new Random();
    int score = 0;
    for (int i = 1; i<= 5; i++){
            int num1 = random.nextInt(21);
            int num2 = random.nextInt(11);
            int calc = random.nextInt(5);

            int solution = 0;
            String question = "Solve this:";
            switch (calc) {
                case 0:
                    solution = num1 + num2;
                    question += num1 + " + " + num2;
                    break;
                case 1:
                    solution = num1 - num2;
                    question += num1 + " - " + num2;
                case 2:
                    solution = num1 * num2;
                    question += num1 + " * " + num2;
                case 3:
                    num2 = (num2 == 0) ? 1 : num2;
                    solution = num1 / num2;
                    question += num1 / num2;
                    break;
                case 4:
                    solution = num1 + num2;
                    question += num1 + " + " + num2;
                    break;
            }
            System.out.println(question);
            System.out.println("Answer is :");
            int userAnswer = scanner.nextInt();
            if (userAnswer == solution) {
                score++;
            }
            if (score >= 5) {
                System.out.println("You are Awesome!");
            } else if (score < 4 && score >=3) {
                    System.out.println("Nice try");
                } else {
                    System.out.println("Better luck next time");
                }

            }

    }
}


