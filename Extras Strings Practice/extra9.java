//9
/* Write a Java program to find the most frequent character in a string. */

import java.util.Scanner;
class MostFrequentCharacter{
    public static void findCharacter(String str){
        char[] arr = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            boolean unique = true;
            for(int j=0; j<s.length(); j++){
                if(arr[i] == s.charAt(j)){
                    unique = false;
                }
            }
            if(unique) s.append(arr[i]);
        }
        
        s.toString();
        char[] sarr = s.toString().toCharArray();
        int[] freq = new int[sarr.length];
        for(int i=0;i<sarr.length;i++){
            for(int j=0; j<arr.length; j++){
                if(sarr[i] == arr[j]){
                    freq[i]++;
                }
            }
        }
        int max = -1;
        char ch = ' ' ;
        for(int i=0; i<freq.length; i++){
            if(freq[i]>max) {
                max = freq[i];
                ch = sarr[i];
            }
        }
        System.out.println("Most repeated character : " + ch);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.next();
        findCharacter(str);
        input.close();
    }
}