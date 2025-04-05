//2
/*Write a program to find the sum of n natural numbers using recursive method and
compare the result with the formulae n*(n+1)/2 and show the result from both computations
is correct. 
 */

import java.util.Scanner;
class sumofNaturalNUmbers{
    public int formulaMethod(int n){
        return n*(n+1)/2;
    }
    public int recursiveMethod(int n){
        if(n>0) return n + recursiveMethod(n-1);
        else return n;
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = input.nextInt();
        if(number<1){
            System.err.println("Enter number is not natural");
            System.exit(0);
        }

        sumofNaturalNUmbers obj = new sumofNaturalNUmbers();
        int formulaSum = obj.formulaMethod(number);
        int recursiveSum = obj.recursiveMethod(number);
        System.out.println("The sum using formula method : " + formulaSum);
        System.out.println("The sum using recursive method : " + recursiveSum);

        if(formulaSum == recursiveSum){
            System.out.println("Both results are equal ");
        }
        else {
            System.out.println("Both results are not equal ");
        }
        input.close();
    }
}
