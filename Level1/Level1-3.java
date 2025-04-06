//3
/* Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in
toCharArray() method, and display the result
*/

import java.util.Scanner;
class characters{
    public static char[] userMethod(String str){
        char[] chars = new char[str.length()];
        for(int i=0;i<chars.length ; i++){
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    public static boolean compare(char[] chars1, char[] chars2){
        if(chars1.length != chars2.length) return false;
        for(int i=0; i<chars1.length; i++){
            if(chars1[i] != chars2[i]) return false;
        }
        return true;
}
    public static void main(String[] args){
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str = input.next();
        char[] chars1 = str.toCharArray();
        char[] chars2 = characters.userMethod(str);
        boolean res = characters.compare(chars1, chars2);

        if(res) System.out.println("Both are same");
        else System.out.println("Both are not same");

        input.close();
    }
}