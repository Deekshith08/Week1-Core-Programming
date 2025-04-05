//9
//Write a program to take 2 numbers and print their quotient and reminder

import java.util.Scanner;
class quotRem{
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int[] result = new int[2];
        result[0] = number/divisor;
        result[1] = number%divisor;
        return result;
    }
    public static void main(String[] args) {
        int number,divisor;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        number = input.nextInt();

        System.out.print("Enter second number : ");
        divisor = input.nextInt();

        int[] res = quotRem.findRemainderAndQuotient(number, divisor);
        System.out.println("The quotient is " + res[0] + " and remainder is " + res[1]);
        input.close();
    }
}