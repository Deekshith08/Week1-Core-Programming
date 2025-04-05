//9
/*Write a program to take user input for 5 numbers and check whether a number is 
positive or negative. Further for positive numbers check if the number is even or odd. 
Finally compare the first and last elements of the array and display if they are equal,
greater, or less
 */

import java.util.Scanner;
class Comparision{
    public int isPositive(int n){
        if(n>0) return 1;
        else return -1;
    }
    public int isEven(int n){
        if(n%2==0) return 1;
        else return 0;
    }
    public int isCompare(int x,int y){
        if(x>y) return 1;
        else if(x==y) return 0;
        else return -1;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        Scanner input = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter number " + (i+1) + " : ");
            arr[i] = input.nextInt();
        }
        Comparision obj = new Comparision();
        for(int i=0; i<arr.length; i++){
            int res1 = obj.isPositive(arr[i]);
            if (res1==1) System.out.print(arr[i] + " is positive ");
            else System.out.print(arr[i] + " is negative ");

            int res2 = obj.isEven(arr[i]);
            if (res2==1) System.out.println(" and is even ");
            else System.out.println(" and is odd ");
        }

        int first = arr[0] , last = arr[arr.length-1];
        int res3 = obj.isCompare(first,last);
        if(res3==1) System.out.println("The first number " + first + " is greater than the last number " + last);
        else if(res3==0) System.out.println("The first number " + first + " equals to the last number " + last);
        else System.out.println("The first number " + first + " is lesser than the last number " + last);
        input.close();
    }
}
