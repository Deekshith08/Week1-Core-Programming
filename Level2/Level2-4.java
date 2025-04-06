//4
/*Write a program to split the text into words and find the shortest and longest strings
in a given text
 */

import java.util.Scanner;
class shortestAndLongest{
    public static String[] spliting(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        int wordsCount = count + 1;
        String[] words = new String[wordsCount];
        int start = 0, wordIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex++] = str.substring(start, i);
                start = i + 1;
            }
        }
        
        words[wordIndex] = str.substring(start);
        
        return words;
    }
    public static int noBuiltinLength(String str){
        int len = 0;
        try{
            while(true){
                str.charAt(len);
                len++;
            }
        }
        catch(RuntimeException e){
            return len;
        }
    }
    public static String[][] WordsLength(String[] words){
        String[][] wordsNew = new String[words.length][2];
        for(int i=0; i<words.length; i++){
            wordsNew[i][0] = words[i];
            int s = noBuiltinLength(words[i]);
            wordsNew[i][1] = String.valueOf(s);
        }
        return wordsNew;
    }
    public static String[] shortandlong(String[][] words){
        String[]  result = new String[2];
        result[0] = words[0][0];
        result[1] = words[0][0];
        int shortest = Integer.valueOf(words[0][1]);
        int longest = Integer.valueOf(words[0][1]);
        for(int i=0; i<words.length; i++){
            int c = Integer.valueOf(words[i][1]);
            if(c<shortest) {
                shortest = c;
                result[0] = words[i][0];}
            
            if(c>longest) {
                longest = c;
                result[1] = words[i][0];}
        }
        return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = input.nextLine();
        String[] words = shortestAndLongest.spliting(str);
        String[][] wordsNew = shortestAndLongest.WordsLength(words);
        for(int i=0; i<wordsNew.length; i++){
            System.out.println(wordsNew[i][0] + "  -  " + Integer.parseInt(wordsNew[i][1]));
        }
        String[] res = shortestAndLongest.shortandlong(wordsNew);
        System.out.println("Shortest string is : " + res[0]);
        System.out.println("Longest string is : " + res[1]);

        input.close();

    }
}