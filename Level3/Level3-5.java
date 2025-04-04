//5
//Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code


import java.util.Scanner;
import java.lang.Math;
class Main {

   public static void main(String[] args) {
	   
      Scanner input = new Scanner(System.in);
      int origNumber = input.nextInt();
      int number = origNumber;
      int sum = 0;

      while (number != 0) {
         int digit = number % 10;
         sum += Math.pow(digit,3);
         number = number / 10;
      }
	  
	  if(origNumber==sum){
		  System.out.println("Given number is Armstrong number");
	  }
	  else{
		  System.out.println("Given number is not a Armstrong number");
	  }
   }
}
