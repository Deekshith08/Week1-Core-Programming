//6
//Create a program to count the number of digits in an integer.


import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
	   
      Scanner input = new Scanner(System.in);
      int origNumber = input.nextInt();
      int number = origNumber;
      int count = 0;

      while (number != 0) {
         int digit = number % 10;
         count+=1;
         number = number / 10;
      }
	  
	  System.out.println("The entered number have " + count + " digits ");  
   }
}

