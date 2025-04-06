//6
/* Write a program to find the frequency of characters in a string using nested loops and
display the result
*/

import java.util.Scanner;

class CharacterFrequency {
    public static String[] findFrequency(String text) {
        char[] charArray = text.toCharArray(); // Convert string to character array
        int[] frequency = new int[charArray.length]; // Array to store frequencies
        
        // Initialize all frequencies to -1 to differentiate counted values
        for (int i = 0; i < charArray.length; i++) {
            frequency[i] = -1;
        }
        
        // Nested loops to count frequency
        for (int i = 0; i < charArray.length; i++) {
            if (frequency[i] == -1) { // Check if character is already counted
                int count = 1;
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j]) {
                        count++;
                        frequency[j] = 0; // Mark as counted
                    }
                }
                frequency[i] = count;
            }
        }
        
        // Count non-zero frequencies to determine the size of the result array
        int size = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                size++;
            }
        }
        
        // Create the result array
        String[] result = new String[size];
        int index = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (frequency[i] > 0) {
                result[index] = charArray[i] + " - " + frequency[i];
                index++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[] frequencies = findFrequency(input);
        
        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i]);
        }
        
        scanner.close();
    }
}
