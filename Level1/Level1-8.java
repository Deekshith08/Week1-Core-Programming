//8
//Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Initialize maxFactor, factors array, and index
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If array is full, double the size
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    // Copy old factors into the new array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                // Add factor to array
                factors[index++] = i;
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
