//7
//Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        int size = number/2;
        int[] even = new int[size];
        int[] odd = new int[size];
        
        int evenIndex = 0;
        int oddIndex = 0;
        for(int i = 1; i<=number; i++){
            if(i%2==0){
                even[evenIndex] = i;
                evenIndex++; 
            }
            else if(i%2!=0){
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
        System.out.print("The even numbers are : \n ");
        for(int i=0; i<size; i++){
            System.out.print(even[i] + " \n");
        }
        System.out.print("The odd numbers are : \n ");
        for(int i=0; i<size; i++){
            System.out.print(odd[i] + " \n");
        }
        input.close();
    }
}
