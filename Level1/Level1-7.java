//7
//Write a program to find the sum of n natural numbers using loop
import java.util.Scanner;
class naturalNumber{
    public int Sum(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        number = input.nextInt();
        naturalNumber obj = new naturalNumber();

        int sum = obj.Sum(number);
        System.out.println("The sum of " + number + " natural numbers is " + sum);

        input.close();
    }
}
