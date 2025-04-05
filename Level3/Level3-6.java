//6
/* Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different
methods and display results. Make sure all are static methods
*/


import java.util.Scanner;
import java.lang.Math;
class NumberCheckings{
    
    public static int[] findFactor(int number){
        int count = 0;
        for(int i=1; i<number; i++){
            if(number%i==0) count++;
        }
        int[] factorsArr = new int[count];
        int index = 0;
        for(int i=1; i<number; i++){
            if(number%i == 0){
                factorsArr[index] = i;
                index++;
            }
        }
        return factorsArr;
    }
    public static int greatestFactor(int[] factorsArr){
        int greatest = -1;
        for(int i=0; i<factorsArr.length; i++){
            if(factorsArr[i]>greatest) greatest = factorsArr[i];
        }
        return greatest;
    }
    public static int sumofFactors(int[] factorsArr){
        int sum = 0;
        for(int i=0; i<factorsArr.length; i++){
            sum = sum + factorsArr[i];
        }
        return sum;
    }
    public static int productofFactors(int[] factorsArr){
        int product = 1;
        for(int i=0; i<factorsArr.length; i++){
            product = product * factorsArr[i];
        }
        return product;
    }
    public static int productofCubes(int[] factorsArr){
        int product = 1;
        for(int i=0; i<factorsArr.length; i++){
            product = product * (int)(Math.pow(factorsArr[i],3));
        }
        return product;
    }
    public static int perfectNumber(int number,int sum){
        if(number == sum) return 1;
        else return 0;
    }
    public static int abundantNumber(int number,int sum){
        if(sum>number) return 1;
        else return 0;
    }
    public static int deficientNumber(int number,int sum){
        if(sum<number) return 1;
        else return 0;
    }
    public static int strongNumber(int number){
        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        if(sum == original) return 1;
        else return 0;
    }
    
    public static int factorial(int num) {
        int fact = 1;
        for(int i=1; i<=num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        int[] factorsArr = NumberCheckings.findFactor(number);
        System.out.println("The factors are : ");
        for(int i=0; i<factorsArr.length; i++){
            System.out.println(factorsArr[i]);
        }
        int greatest = NumberCheckings.greatestFactor(factorsArr);
        System.out.println("The greatest factor is : " + greatest);

        int sum = NumberCheckings.sumofFactors(factorsArr);
        System.out.println("The sum of factors is : " + sum);

        int product = NumberCheckings.productofFactors(factorsArr);
        System.out.println("The product of factors is : " + product);

        int productofCubes = NumberCheckings.productofCubes(factorsArr);
        System.out.println("The product of cubes of factors is : " + productofCubes);

        int perfect = NumberCheckings.perfectNumber(number, sum);
        if(perfect==1) System.out.print("It is a perfect number");
        else System.out.print("It is not a perfect number");

        int abundant = NumberCheckings.abundantNumber(number, sum);
        if(abundant==1) System.out.print(", abundant number");
        else System.out.print(", not a abundante number");

        int deficient = NumberCheckings.deficientNumber(number, sum);
        if(deficient==1) System.out.print(", deficient number");
        else System.out.print(", not a deficient number"); 

        int strong = NumberCheckings.strongNumber(number);
        if(strong==1) System.out.print(", strong number");
        else System.out.print(", not a strong number");
        input.close();
    }
}

