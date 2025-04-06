//6
//Write a program to demonstrate IllegalArgumentException

import java.util.Scanner;

class IllegalArgumentDemo {
    public static void generateException(String str, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index.");
        }
        System.out.println("Substring: " + str.substring(start, end)); // This will not be reached if exception occurs
    }

    public static void handleException(String str, int start, int end) {
        try {
            System.out.println("Substring: " + str.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        
        int start = 5, end = 2;

        try {
            generateException(str, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }
        generateException(str, start, end);

        //handleException(str, start, end);

        input.close();
    }
}

