//4
//Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double[] arr = new double[10];
        double number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 or -ve integer to stop \n ");
        int i=0;
        while (true) {
            System.out.print("Enter a number : ");
            number = input.nextDouble();
            if (number<=0 || i>(arr.length-1)){
                break;
            }         
            arr[i] = number;
            i++;
        }
        System.out.print("The numbers entered are:");
        double sum = 0;
        for(int j=0; j<(arr.length); j++){
            if(arr[j]<=0){
                break;
            }
            sum = sum + arr[j];
            System.out.print((int)arr[j] + " \n");
        }

        System.out.print("The sum is " + (int)sum);
        input.close();
    }
}