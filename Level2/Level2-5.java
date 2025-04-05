//5
//Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();
        int orignumber = number;
        int count=0;

        while(number!=0){
            count++;
            number = number/10;
        }
        int[] arr = new int[count];

        for(int i=0; i<count; i++){
            int digits = orignumber%10;
            arr[i] = digits; 
            orignumber = orignumber/10;  
        }
        
        System.out.print("The reversed number is: ");
        for(int i=0; i<count; i++){
            System.err.println(arr[i] + "\n");
        }
        input.close();
    }
}