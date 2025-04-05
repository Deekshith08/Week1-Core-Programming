//2
/*Extend or Create a NumberChecker utility class and perform following task. 
Call from main() method the different methods and display results. Make sure all are 
static methods */

import java.util.Scanner;
import java.lang.Math;
class NumberChecker{
    public static int countDigits(int number){
        int count = 0;
        while(number!=0){
            number = number/10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int number,int count){
        int[] digits = new int[count];
        for(int i=count-1; i>=0; i--){
            digits[i] = number%10;
            number /=10;
        }
        return digits;
    }
    public static int duckNumber(int[] digits){
        for(int i=0; i<digits.length; i++){
            if(digits[i] == 0) {
                return 1;
            }
        }
        return 0;
    }
    public static int armstrongNumber(int[] digits,int number){
        int sum = 0;
        for(int i=0; i<digits.length; i++){
            sum = sum + (int)(Math.pow(digits[i],3));
        }
        if(sum==number) return 1;
        else return 0;
    }
    public static int[] largestNumbers(int[] digits){
        int largest = Integer.MIN_VALUE; 
        for(int i=0; i<digits.length; i++){
            if(digits[i] > largest) {
                largest = digits[i];
            }
        }
        int slargest = Integer.MIN_VALUE; 
        for(int i=0; i<digits.length; i++){
            if(digits[i] > slargest && digits[i]!=largest) {
                slargest = digits[i];
            }
        }
        int[] largestNumbers = {largest,slargest};
        return largestNumbers;
    }
    public static int[] smallestNumbers(int[] digits){
        int smallest = Integer.MAX_VALUE; 
        for(int i=0; i<digits.length; i++){
            if(digits[i] < smallest) {
                smallest = digits[i];
            }
        }
        int secsmallest = Integer.MAX_VALUE; 
        for(int i=0; i<digits.length; i++){
            if(digits[i] < secsmallest && digits[i]!=smallest) {
                secsmallest = digits[i];
            }
        }
        int[] smallestNumbers = {smallest,secsmallest};
        return smallestNumbers;
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        int count = NumberChecker.countDigits(number);
        System.out.println("The given number have " + count + " digits ");
        int[] digitsArray = NumberChecker.storeDigits(number, count);
        int duck = NumberChecker.duckNumber(digitsArray);
        if(duck==1) System.out.print("The entered number is a duck number ");
        else System.out.print("The entered number is not a duck number ");
        int armstrong = NumberChecker.armstrongNumber(digitsArray, number);
        if(armstrong == 1) System.out.println("and it is a armstrong number ");
        else System.out.println("and it is not a armstrong number ");
        int[] largeElements = NumberChecker.largestNumbers(digitsArray);
        int[] smallElements = NumberChecker.smallestNumbers(digitsArray);
        System.out.println("The largest digit is " + largeElements[0] + " and second largest digit is " + largeElements[1]);
        System.out.println("The smallest digit is " + smallElements[0] + " and second smallest digit is " + smallElements[1]);
        input.close();
    }
}