//10
//Write a program to create a calculator using switch...case.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double first, second;
        String op;
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of times you want to perform operation: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            System.out.print("\nEnter first number: ");
            first = input.nextDouble();

            System.out.print("Enter second number: ");
            second = input.nextDouble();

            // Clear the newline character left by nextDouble()
            input.nextLine();

            System.out.print("Enter one of the operators (+, -, * or /): ");
            op = input.nextLine();

            switch (op) {
                case "+":
                    System.out.println("The result of addition is: " + (first + second));
                    break;
                case "-":
                    System.out.println("The result of subtraction is: " + (first - second));
                    break;
                case "*":
                    System.out.println("The result of multiplication is: " + (first * second));
                    break;
                case "/":
                    if (second != 0) {
                        System.out.println("The result of division is: " + (first / second));
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
        input.close();
    }
}