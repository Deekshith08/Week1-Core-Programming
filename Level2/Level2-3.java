//3
/*Write a program to split the text into words and return the words along with their lengths in a 2D array
 */

import java.util.Scanner;
class SplitTheText2D{
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
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = input.nextLine();
        String[] words = SplitTheText2D.spliting(str);
        String[][] wordsNew = SplitTheText2D.WordsLength(words);
        for(int i=0; i<wordsNew.length; i++){
            System.out.println(wordsNew[i][0] + "  -  " + Integer.parseInt(wordsNew[i][1]));
        }
        input.close();

    }
}