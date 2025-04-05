//10
//Create a program to divide N number of chocolates among M children. Print the number of
// chocolates each child will get and also the remaining chocolates

import java.util.Scanner;
class chocolates{
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int[] result = new int[2];
        result[0] = number/divisor;
        result[1] = number%divisor;
        return result;
    }
    public static void main(String[] args) {
        int numberofChocolates,numberofChildren;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of chocolates : ");
        numberofChocolates = input.nextInt();

        System.out.print("Enter number of children : ");
        numberofChildren = input.nextInt();

        int[] res = chocolates.findRemainderAndQuotient(numberofChocolates, numberofChildren);
        System.out.println("Each child gets " + res[0] + " chocolates and remaining are " + res[1]);
        input.close();
    }
}

