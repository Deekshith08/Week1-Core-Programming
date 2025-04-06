//12
/*Write a replace method in Java that replaces a given word with another word in a
sentence
 */

import java.util.Scanner;
class StringReplace{
    public static void replaceWord(String sentence, String word, String newword){
        String newstr = sentence.replace(word,newword);
        System.out.println("Modified Sentence : \n" + newstr);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String sentence = input.nextLine();
        System.out.println("Enter the word to be replaced : ");
        String word = input.next();
        System.out.println("Enter the new word : ");
        String newword = input.next();
        replaceWord(sentence, word, newword);        
        input.close();
    }
}