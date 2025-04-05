//1
/*Create a program to find the factors of a number taken as user input, store the factors
in an array, and display the factors. Also find the sum, sum of square of factors and
product of the factors and display the results
 */

import java.util.Scanner;
import java.lang.Math;
class usefactors{
    public static int[] findFactors(int n){
        int count =0;
        for(int i=1; i<n; i++){
            if (n%i==0) {
                count++;
            }
        }
        int [] factors = new int[count];
        int index=0;
        for(int i=1; i<n;i++){
            if(n%i==0){
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    public static int factorsSum(int[] factors){
        int sum = 0;
        for(int i=0; i<factors.length; i++){
            sum += factors[i];
        }
        return sum;
    }
    public static int factorsProduct(int[] factors){
        int prod = 1;
        for(int i=0; i<factors.length; i++){
            prod *= factors[i];
        }
        return prod;
    }
    public static int factorsSumofSquares(int[] factors){
        int sum = 0;
        for(int i=0; i<factors.length; i++){
            sum = sum + (int)Math.pow(factors[i],2);
        }
        return sum;
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        int[] factors = usefactors.findFactors(number);
        int sumofFactors = usefactors.factorsSum(factors);
        int productofFactors = usefactors.factorsProduct(factors);
        int sumofSquares = usefactors.factorsSumofSquares(factors);
        System.out.println("The factors of " + number + " : ");

        for(int i=0; i<factors.length;i++){
            System.out.println(factors[i]);
        }

        System.out.println("The sum of the factors : " + sumofFactors);
        System.out.println("The product of the factors : " + productofFactors);
        System.out.println("The sum of squares of the factors : " + sumofSquares);
        input.close();
    }
}
