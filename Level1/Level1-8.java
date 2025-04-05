//8
//Write a program to find the smallest and the largest of the 3 numbers.

import java.util.Scanner;
class smallLarge{
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int[] result = new int[2];
        if(number1<number2 && number1<number3){
            result[0] = number1;
            if(number2>number3) result[1] = number2;
            else result[1] = number3;
        }
        else if(number2<number1 && number2<number3){
            result[0] = number2;
            if(number1>number3) result[1] = number1;
            else result[1] = number3;
        }
        else if(number3<number1 && number3<number2){
            result[0] = number3;
            if(number1>number2) result[1] = number1;
            else result[1] = number2;
        }
        return result;
    }
    public static void main(String[] args) {
        int number1,number2,number3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        number1 = input.nextInt();

        System.out.print("Enter second number : ");
        number2 = input.nextInt();

        System.out.print("Enter third number : ");
        number3 = input.nextInt();

        int[] res = smallLarge.findSmallestAndLargest(number1,number2,number3);
        System.out.println("The smallest number is : " + res[0]);
        System.out.println("The largest number is : " + res[1]);
        input.close();
        } 
    }

