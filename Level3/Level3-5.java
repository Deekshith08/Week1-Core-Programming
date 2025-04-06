//5
/*Write a program to find the frequency of characters in a string using unique characters and display the result
 */

import java.util.Scanner;
class FrequencyOfCharacters{
    public static char[] ReturnUnique(String text){
        StringBuilder str = new StringBuilder();
        for(int i=0; i<text.length();i++){
            boolean unique = true;
            for(int j=0; j<str.length(); j++){
                if(text.charAt(i) == str.charAt(j)){
                    unique = false;
                }
            }
            if(unique) str.append(text.charAt(i));
        }
        return str.toString().toCharArray();
        
    }
    public static String[][] FindFrequencies(String text){
        int[] arr = new int[256];
        for(int i=0; i<text.length();i++){
            arr[text.charAt(i)]++;
        }
        char[] unique = ReturnUnique(text);
        String[][] result = new String[unique.length][2];
        for(int i=0; i<result.length; i++){
            result[i][0] = Character.toString(unique[i]);
            String count = String.valueOf(arr[unique[i]]);
            result[i][1] = count;
        }
        return result;
    }
    public static void main(String[] args){
        String text;
        Scanner input = new Scanner(System.in);
        text = input.next();
        String[][] freq = FindFrequencies(text);
        for(int i=0; i<freq.length; i++){
            System.out.println(freq[i][0] + " - " + freq[i][1]);
        }
        input.close();


    }
}
