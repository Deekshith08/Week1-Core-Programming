//11
/*Write a Java program that accepts two strings from the user and checks if the two strings are 
anagrams of each other (i.e., whether they contain the same characters in any order).  */

import java.util.Scanner;
class Anangram{
    public static void checkAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() != str2.length()){
            System.out.println("Not anagrams");
        }
        else{
            int[] arr = new int[256];
            for(int i=0; i<str1.length(); i++){
                arr[str1.charAt(i)]++;
                arr[str2.charAt(i)]--;
            }                    
            boolean anagram = true;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>0) anagram = false;
            }
            if (anagram) System.out.println("Both strings are anagrams");
            else System.out.println("Both strings are not anagrams");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first String : ");
        String str1 = input.next();
        System.out.print("Enter second String : ");
        String str2 = input.next();
        checkAnagram(str1, str2);

        input.close();

    }
}