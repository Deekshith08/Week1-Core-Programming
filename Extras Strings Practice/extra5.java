//5
/*Write a Java program that takes a sentence as input and returns the longest word in the
sentence. 
 */

import java.util.Scanner;
class LongestWord{
    public static void FindLongest(String str){
        String[] words = str.split(" ");
        String longestWord = "";
        for(int i=0; i<words.length; i++){
            if(words[i].length()>longestWord.length()){
                longestWord = words[i];
            }
        }
        System.out.println("The longest word is : " + longestWord);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        FindLongest(sentence);

        input.close();
    }
}