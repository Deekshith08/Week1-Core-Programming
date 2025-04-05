//3
//Create a program to store the digits of the number in an array and find the largest and 
//second largest element of the array.

import java.util.Scanner;
class SecongLargest{
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index=0;
        while(number!=0){
            int digit = number%10;
            digits[index] = digit;
            number = number/10;
            index++;
            if(index==maxDigit){
                break;
            }
        }
        int largest = 0, secondlargest = 0;
        for(int i=0; i<digits.length; i++){
            if(digits[i]>largest){
                largest = digits[i];
            }
        }
        System.out.println("The largest digit is : "+ largest + "\n");
        for(int i=0; i<digits.length; i++){
            if(digits[i]>secondlargest && digits[i]!=largest){
                secondlargest = digits[i];
            }
        }
        System.out.println("The second largest digit is : "+ secondlargest);
        input.close();
    }
}
