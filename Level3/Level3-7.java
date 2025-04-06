//7
/* Write a program to to check if a text is palindrome and display the result
*/

import java.util.Scanner;
class Palindrome{
    public static boolean Method1(String text){
        int start =0;
        int end = text.length()-1;
        for(int i=0;i<text.length();i++){
            char startch = text.charAt(start);
            char endch = text.charAt(end);
            if(startch!=endch) return false;
            start++;
            end--;
        }
        return true;
    }
    public static boolean Method2(String text, int start, int end){
        if(start>=end) return true;
        if(text.charAt(start)!=text.charAt(end)) return false;
        return Method2(text, start+1, end-1);
    }
    public static boolean Method3(String text){
        char[] arr1 = text.toCharArray();
        char[] arr2 = new char[text.length()];
        int index=0;
        for(int i=text.length()-1;i>=0;i--){
            arr2[index] = text.charAt(i);
            index++;
        }
        for(int i=0; i<text.length(); i++){
            if(arr1[i] != arr2[i]) return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        boolean res = Method1(text);
        if(res) System.out.println("Using Method 1 : Its a palindrome");
        else System.out.println("Using method 1 : Its not a palindrome");
        boolean res1 = Method2(text,0,text.length()-1);
        if(res1) System.out.println("Using Method 2 : Its a palindrome");
        else System.out.println("Using Method 2 : Its not a palindrome");
        boolean res2 = Method3(text);
        if(res2) System.out.println("Using Method 3 : Its a palindrome");
        else System.out.println("Using method 3 : Its not a palindrome");
        input.close();

    }
}