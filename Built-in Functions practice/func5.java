//5

import java.util.Scanner;
class Palindrome{
    public static String takeInput(){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        input.close();
        return text;

    }
    public static boolean checkPalindrome(String text){
        String str = "";
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            str = ch + str;
        }
        if(str.equals(text)) return true;
        else return false;
        
    }
    public static void main(String[] args) {
        String text = takeInput();
        boolean res = checkPalindrome(text);
        if(res) System.out.println("Its a palindrome");
        else System.out.println("Not a palindrome");
    }
}
