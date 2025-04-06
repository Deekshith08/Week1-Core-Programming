//8
/* Write a program to check if two texts are anagrams and display the result
*/
import java.util.Scanner;
class Anagram{
    public static boolean CheckAnagram(String str1,String str2){
        int[] count = new int[256];
        if(str1.length()!=str2.length()) return false;
        for(int i=0; i<str1.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i=0; i<count.length; i++){
            if(count[i]!=0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        boolean res = CheckAnagram(str1, str2);
        if(res) System.out.println("Its anagram");
        else System.out.println("Its not an anagram");
        input.close();
    }
}