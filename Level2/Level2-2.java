//2
/*Write a program to split the text into words, compare the result with the split() method
and display the result 
*/

import java.util.Scanner;
class SplitTheText{
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
    public static String[] spliting(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        int wordsCount = count+1;
        int[] indices = new int[count];
        int index = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                indices[index] = i;
                index++;
            }
        }
        String[] words = new String[wordsCount]; 
        if(count>0){
            words[0] = str.substring(0,indices[0]);
        }else{
            words[0] = str;
        }
        
        for(int i=1;i<indices.length; i++){
            words[i] = str.substring(indices[i-1]+1,indices[i]);
        }
        words[wordsCount-1] = str.substring(indices[count-1]+1);
        return words;
    }
    public static boolean comparision(String[] words1, String[] words2){
        if(words1.length != words2.length) return false;
        for(int i=0; i<words1.length; i++){
            if(words1[i].compareTo(words2[i]) != 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();

        String[] words1 = SplitTheText.spliting(str);
        for(int i=0; i<words1.length; i++){
            System.out.println(words1[i]);
        }
        String[] words2 = str.split(" " );
        boolean res = SplitTheText.comparision(words1, words2);
        if(res) System.out.println("Both arrays are same ");
        else System.out.println("Both arrays are not same ");

        input.close();
    }
}
