
import java.util.Random;
import java.util.Scanner;

public class Testing {
    //1. Ask the user for their name
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("What is your full name?");
        String fullName = scanner.nextLine();
        int score = 0;
        //2. Print a personalized welcome message
        System.out.println("Hello " + fullName + "! Welcome to the Mathematics Skill Test." );
        //Pose five random math question
        int num1 = random.nextInt(1,20);
        int num2 = random.nextInt(1, 5);

        System.out.println(num1 +" + "+ num2);
        int sum = num1 + num2;
        int userSum = scanner.nextInt();
        if (userSum == sum){
            score++;
        } else {
            System.out.println( userSum + " is a wrong answer. The correct answer is " + sum);
        }

        System.out.println(num1 + " - " +num2);
        int subtract = num1 - num2;
        int userSubtract = scanner.nextInt();
        if (userSubtract == subtract){
            score++;
        } else {
            System.out.println(userSubtract + " is a wrong answer. The correct answer is " + subtract);
        }
        System.out.println(num1 + " * " +num2);
        int product = num1 * num2;
        int userProduct = scanner.nextInt();
        if (userProduct == product){
            score++;
        } else {
            System.out.println(userProduct + "is a wrong answer. The correct answer is " + product);
        }
        System.out.println(num1 + " / " +num2);
        int divide = num1 / num2;
        int userDivide = scanner.nextInt();
        if (userDivide == divide){
            score++;
        } else {
            System.out.println(userDivide + "is a wrong answer. The correct answer is " + divide);
        }
        System.out.println(" Your score is " + score);
        }

    }

