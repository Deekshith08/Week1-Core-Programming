//4
/*Write a program to find the frequency of characters in a string using the charAt() method and display the
result
 */

import java.util.Scanner;
class FindFrequency{
    public static String[][] getfreq(String text){
        int[] count = new int[256];
        for(int i=0; i<text.length();i++){
            count[text.charAt(i)]++;
        }
        int l=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>=1) l++;
        }
        String[][] charfrequency = new String[l][2];
        int index = 0;
        for(int i=0; i<count.length; i++){
            
            if(count[i]>0){
                charfrequency[index][0] = Character.toString((char) i);
                charfrequency[index][1] = String.valueOf(count[i]);
                index++;
            }            
        }
        return charfrequency;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();

        String[][] freq = getfreq(text);
        for(int i=0; i<freq.length;i++){
            System.out.println(freq[i][0] + " - " + freq[i][1]);
        }
        input.close();
    }
}
