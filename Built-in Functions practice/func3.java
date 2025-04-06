//3

import java.util.Scanner;
class PrimeNumberChecker{
    public static boolean isPrime(int n){
        boolean flag = true;
        for(int i=2; i<n; i++){
            if(n%i==0) flag = false;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(isPrime(n)) System.out.println("Its a prime");
        else System.out.println("Not a prime");

        input.close();
    }
}