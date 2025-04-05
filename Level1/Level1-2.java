//2
//Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less

import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner input = new Scanner(System.in);

        for(int i=0; i<(arr.length); i++){
            System.out.print("Enter number " + (i+1) + " : ");
            arr[i] = input.nextInt();
        }

        for(int i=0; i<(arr.length); i++){
            if(arr[i]>0){
                System.out.print("Entered number " + arr[i] + " is positive ");
            }
            else if(arr[i]<0){
                System.out.print("Entered number " + arr[i] + " is negative ");
            }
            else{
                System.out.print("Entered number " + arr[i] + " is zero ");
            }

            if(arr[i]%2==0){
                System.out.print("and it is even \n");
            }
            else if(arr[i]%2!=0){
                System.out.print("and it is odd \n");
            }
            else{
                System.out.print("and it is  not even nor odd \n");

            }
        }
        input.close();
        
    }
    
}
