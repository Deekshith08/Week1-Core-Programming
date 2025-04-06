//3
/* Write a program to find the first non-repeating character in a string and show the 
result
*/

import java.util.Scanner;
class FindNonRepeating{
    public static char FirstNonRepeating(String text){
        int[] count = new int[256];
        for(int i=0; i<text.length();i++){
            count[text.charAt(i)]++;
        }
        for(int i=0;i<text.length(); i++){
            if(count[text.charAt(i)] == 1){
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.next();
        char res = FirstNonRepeating(text);
        System.out.println("The first non repeating character is : " + res);
        input.close();
    }
}