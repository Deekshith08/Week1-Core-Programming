//9
//Create a program to check if a number is an Abundant Number.



import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
	   
      Scanner input = new Scanner(System.in);
	  System.out.print("Enter a number : ");
      int origNumber = input.nextInt();
      int number = origNumber;
      int sum = 0;
	  
	  for (int i = 1; i<number; i++){
		  if(number%i == 0){
			  sum += i;
		  }
	  }
	  
	  System.out.println("sum is " + sum);
	  if(origNumber<sum){
		  System.out.println("The entered number is a Abundant Number");  
	  }
	  else{
		  System.out.println("The entered number is not a Abundant Number");
	  }
   }
}