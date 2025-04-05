//3
/*Extend or Create a NumberChecker utility class and perform following task. 
Call from main() method the different methods and display results. Make sure all are
static methods */


import java.util.Scanner;
import java.lang.Math;
class NumberCheckers{
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
    public static int sumofDigits(int[] digits){
        int sum = 0;
        for(int i=0; i<digits.length; i++){
            sum = sum + digits[i];
        }
        return sum;
    }
    public static int sumofSquares(int[] digits){
        int sum = 0;
        for(int i=0; i<digits.length; i++){
            sum = sum + (int)(Math.pow(digits[i], 2));
        }
        return sum;
    }
    public static int harshadNumber(int number,int sum){
        if(number%sum==0) return 1;
        else return 0;
    }
    public static int[][] freqofDigits(int[] digits){
        int[][] freq = new int[10][2];
        for(int i=0; i<digits.length; i++){
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for(int i=0; i<digits.length; i++){
            freq[digits[i]][1]++;
        }
        
        return freq;
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        int count = NumberCheckers.countDigits(number);
        System.out.println("The given number have " + count + " digits ");
        int[] digitsArray = NumberCheckers.storeDigits(number, count);

        int sum = NumberCheckers.sumofDigits(digitsArray);
        System.out.println("The sum of digits : " + sum);

        int sumofSquares = NumberCheckers.sumofSquares(digitsArray);
        System.out.println("The sum of squares of digits : " + sumofSquares);

        int harshadNumber = NumberCheckers.harshadNumber(number,sum);
        if(harshadNumber == 1) System.err.println("Entered number is a harshad number");
        else System.err.println("Entered number is not a harshad number");

        int[][] freq = NumberCheckers.freqofDigits(digitsArray);
        for(int i=0; i<digitsArray.length; i++){
            System.out.println("Frequency of " + freq[i][0] + " : " + freq[i][1]);
        }
        input.close();
    }
}