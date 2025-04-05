//3
//Create a program to print a multiplication table of a number.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int number;
        int[] arr = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        for(int i=0; i<(arr.length); i++){
            arr[i] = number*(i+1);
        }
        for(int i=0;i<(arr.length); i++){
            System.out.print(number + " x " + (i+1) + " = " + arr[i] + " \n ");
        }

        input.close();

    }
    
}
