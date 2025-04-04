//7
//Create a program to find the BMI of a person


import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
	  double weight;
	  double height;
	  
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter your height in cm : ");
       height = input.nextDouble();
	  
	  System.out.println("Enter your weight in kg : ");
       weight = input.nextDouble();
	   height = height*0.01;	  
      double BMI = weight / (height * height);
	  
	  if(BMI<=18.4){
		  System.out.println("Status : Underweight");
	  }
	  
	  else if(BMI>=18.5 && BMI<=24.9){
		  System.out.println("Status : Normal");
	  }
	  
	  else if(BMI>=25.0 && BMI<=39.9){
		  System.out.println("Status : Overweight");
	  }
	  
	  else if(BMI>=40.0){
		  System.out.println("Status : Obese");
	  }	  
   }
}