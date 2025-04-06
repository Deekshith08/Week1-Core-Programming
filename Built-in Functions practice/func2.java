//2

import java.util.Scanner;
class MaximumOfThree{
    public static int[] takeInput(int size){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter number " + (i+1) + " : ");
            numbers[i] = input.nextInt();
        }
        input.close();
        return numbers;
    }
    public static void findMax(int[] numbers){
        int max = -1;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("The maximum number is :" + max);
    }

    
    public static void main(String[] args){
        int size = 3;
        int[] numbers = takeInput(size);
        findMax(numbers);
    }
}
