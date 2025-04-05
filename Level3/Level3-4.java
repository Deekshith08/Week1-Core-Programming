//4
/*Extend or Create a NumberChecker utility class and perform following task. Call from
main() method the different methods and display results. Make sure all are static methods
 */


import java.util.Scanner;
class NumberChecking{
    public static int countDigits(int number){
        int count = 0;
        while(number!=0){
            number = number/10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int number,int count){
        int[] digits = new int[count];
        for(int i=count-1; i>=0; i--){
            digits[i] = number%10;
            number /=10;
        }
        return digits;
    }
    public static int[] reverseArray(int[] digits){
        int[] revArr = new int[digits.length];
        int index = 0;
        for(int i=digits.length-1; i>=0; i--){
            revArr[index] = digits[i];
            index++;
        }
        return revArr;
    }
    public static int palindrome(int[] digits, int[] revArr){
        for(int i=0;i<digits.length;i++){
            if(digits[i]==revArr[i]) return 1;
        }
        return 0;
    }
    public static int duckNumber(int[] digits) {
        for(int i=1;i<digits.length;i++){
            if(digits[i] == 0) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        int count = NumberChecking.countDigits(number);
        System.out.println("The given number have " + count + " digits ");
        int[] digitsArray = NumberChecking.storeDigits(number, count);
        int[] revArr = NumberChecking.reverseArray(digitsArray);
        System.out.println("The array is ");
        for(int i=0; i<digitsArray.length;i++ ){
            System.out.println(digitsArray[i]);
        }
        System.out.println("Reversed array is ");
        for(int i=0; i<revArr.length;i++ ){
            System.out.println(revArr[i]);
        }
        int palindrome = NumberChecking.palindrome(digitsArray, revArr);
        if(palindrome == 1) System.out.print("It is a palindrome ");
        else System.out.print("It is not a palindrome ");
        int duckNumber = NumberChecking.duckNumber(digitsArray);
        if(duckNumber == 1) System.out.println("and is a duck number ");
        else System.out.println("and is not a duck number");
        input.close();
    }
}
