//10
//Create a program to take a number as input find the frequency of each digit in the number using an array and
// display the frequency of each digit


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int origNumber = input.nextInt();
        int number = origNumber;
        int temp = origNumber;
        int count = 0;

        while (number != 0) {
            count+=1;
            number = number / 10;
        }
        System.out.println("The entered number have " + count + " digits ");  
        int[] digits = new int[count];

        for(int i=0; origNumber>0; i++){
            int digit = origNumber%10;
            digits[i] = digit;
            origNumber = origNumber/10;

        }
        int[] freq = new int[10];
        for(int i=0; temp>0; i++){
            int digit = temp%10;
            freq[digit]++;
            temp = temp/10;
        }
        
        for(int i=0; i<10; i++){
            if(freq[i]!=0){
                System.out.print("Frequency of digit " + i + ": " + freq[i] + "\n");
            }
        }
        input.close();
    }
}


