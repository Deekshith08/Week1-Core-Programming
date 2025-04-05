//10
/*Write a program FizzBuzz, take a number as user input and if it is a positive integer 
loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead 
of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". 
Finally, print the array results for each index position in the format Position 1 = 1, …, 
Position 3 = Fizz,...*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = input.nextInt();

        String[] arr = new String[number];

        for (int i=0; i<number; i++){
            if((i+1)%3==0 && (i+1)%5==0){
                arr[i]="FizzBuzz";
            }
            else if((i+1)%3==0){
                arr[i]="Fizz";
            }
            else if((i+1)%5==0){
                arr[i]="Bizz";
            }
            else{
                arr[i] = Integer.toString(i+1);
            }
        }
        for(int i=0; i<(arr.length); i++){
            System.out.print("Position " + (i+1) + " : " + arr[i] + "\n" );
        }
        input.close();
    }
}
