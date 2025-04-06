//4
/*Write a Java program to remove all duplicate characters from a given string and return
the modified string. 
*/

import java.util.Scanner;
class DuplicateCharacters{
    public static void removeDuplicates(String str){
        String str1 = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(str1.indexOf(ch)==-1){
                str1=str1+ch;
            }
        }
        System.out.println(str1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        removeDuplicates(str);

        input.close();
    }
}