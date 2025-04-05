//1
//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.


import java.util.Scanner;
class Main{
    
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);

        for(int i=0; i<(arr.length); i++){
            System.out.print("Enter the age of student number " + (i+1) + " : ");
            arr[i] = input.nextInt();
            if(arr[i]<=0){
                System.err.println("You entered a invalid age");
                System.exit(0);
            }
        }

        for(int i=0; i<(arr.length); i++){
            if(arr[i]>=18){
                System.out.print("The student with age " + arr[i] + " is eligible to vote\n");
            }
            else{
                System.out.print("The student with age " + arr[i] + " is not eligible to vote\n");

            }
        }
        input.close();
    }
}