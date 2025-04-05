//5
/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the
different methods and display results. Make sure all are static methods
*/

import java.util.Scanner;
class NumberChecks{
    
    public static int isPrime(int number){
        int count =0;
        for(int i=2; i<number; i++){
            if(number%i==0){
                count++;
                break;
            }
        }
        if(count==1) return 1;
        else return 0;
    }
    public static int isNeon(int number){
        int sum =0;
        int OrigNumber = number;
        while(number!=0){
            int digit = number%10;
            sum = sum + (digit*digit);
            number = number/10;
        }
        if(sum == OrigNumber) return 1;
        else return 0;
    }
    public static int isSpy(int number){ 
        int sum = 0, product = 1;
        while(number!=0){
            int digit = number%10;
            sum = sum + digit;
            product = product*digit;
            number = number/10;
        }
        if(sum == product) return 1;
        else return 0;
    }
    public static int isAutomorphic(int number){
        int square = number*number;
        if(square%10 == number) return 1;
        else return 0;
    }
    public static int isBuzz(int number){
        
        if(number%7==0 || number%10==7) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        int prime = NumberChecks.isPrime(number);
        if(prime==1) System.out.print("Number is prime");
        else System.out.println("Number is not prime");

        int neon = NumberChecks.isNeon(number);
        if(neon==1) System.out.print(", neon number ");
        else System.out.print(", not neon number");

        int spy = NumberChecks.isSpy(number);
        if(spy==1) System.out.print(", spy number");
        else System.out.print(", not spy number");

        int auto = NumberChecks.isAutomorphic(number);
        if(auto==1) System.out.print(", automorphic number");
        else System.out.print(", not automorphic number");

        int buzz = NumberChecks.isBuzz(number);
        if(buzz==1) System.out.print(", buzz number");
        else System.out.print(", not buzz number");


        input.close();
    }
}

