//8
//Create a program to check if a number taken from the user is a Harshad Number.


import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
	   
      Scanner input = new Scanner(System.in);
	  System.out.print("Enter a number : ");
      int origNumber = input.nextInt();
      int number = origNumber;
      int sum = 0;

      while (number != 0) {
         int digit = number % 10;
         sum += digit;
         number = number / 10;
      }
	  
	  System.out.println("sum is " + sum);
	  if(origNumber%sum==0){
		  System.out.println("The entered number is a Harshad Number");  
	  }
	  else{
		  System.out.println("The entered number is not a Harshad Number");
	  }
   }
}