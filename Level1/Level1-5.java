//5
//Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int number;
        int[] multiplicationResult = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 6 to 9 : ");
        number = input.nextInt();

        if(number<6 || number>9){
            System.err.println("Entered number is not between 6 to 9");
            System.exit(0);
        }

        for(int i=0; i<(multiplicationResult.length); i++){
            multiplicationResult[i] = number*(i+1);
        }
        for(int i=0;i<(multiplicationResult.length); i++){
            System.out.print(number + " x " + (i+1) + " = " + multiplicationResult[i] + " \n ");
        }
        input.close();
    }
}
