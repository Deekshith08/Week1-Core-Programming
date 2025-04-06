//9

import java.util.Scanner;
class BasicCalculator{
    public static void operations(int num1, int num2, char ch){
        switch(ch){
            case '+':
            System.out.println("Result : " + (num1+num2));
            break;
            case '-':
            System.out.println("Result : " + (num1-num2));
            break;
            case '*':
            System.out.println("Result : " + (num1*num2));
            break;
            case '/':
            System.out.println("Result : " + (num1/num2));
            break;
            case '%':
            System.out.println("Result : " + (num1%num2));
            break;
            default:
            System.out.println("wrong entry");

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        System.out.print("Enter one operation you want to perform( +,-,*,/,%) : ");
        char ch = input.next().charAt(0);
        operations(num1, num2, ch);
        input.close();
    }
}
