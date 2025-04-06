//6


import java.util.Scanner;
class Factorial{
    public static int takeInput(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        input.close();
        return num;
    }
    public static int findFactorial(int num){
        if(num == 0) return 1;
        else  {
            return num*findFactorial(num-1);
        }
    }
    public static void main(String[] args) {
        int num = takeInput();
        int fact = findFactorial(num);
        System.out.println("Factorial : " + fact);
    }
}