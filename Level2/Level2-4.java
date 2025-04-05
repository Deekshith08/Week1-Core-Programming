//4
/*Rework the program 2, especially the Hint f where if index equals maxDigit, we break
from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by
10 if the index is equal to maxDigit. This is done to consider all digits to find the
largest and second-largest number*/


import java.util.Scanner;
class SecongLargest2{
    public static void main(String[] args) {
        long number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index=0;
        while(number!=0){
            int digit = (int)(number%10);
            digits[index] = digit;
            number = number/10;
            index++;
            if(index==maxDigit){
                maxDigit+=10;
                int[] temp = new int[maxDigit];
                for(int i=0; i<index; i++){
                    temp[i] = digits[i];
                }
                digits = temp;
            }
        }
        int largest = -1, secondlargest = -1;
        for(int i=0; i<index; i++){
            if(digits[i]>largest){
                largest = digits[i];
            }
        }
        System.out.println("The largest digit is : "+ largest + "\n");
        for(int i=0; i<index; i++){
            if(digits[i]>secondlargest && digits[i]!=largest){
                secondlargest = digits[i];
            }
        }
        System.out.println("The second largest digit is : "+ secondlargest);
        input.close();
    }
}

