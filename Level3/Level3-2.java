//2
/*Find unique characters in a string using the charAt() method and display the result
 */

import java.util.Scanner;
class UniqueCharacters{
    public static int FindLength(String str){
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
    public static char[] FindUnique(String str){
        int len = FindLength(str);
        char[] unique = new char[len];
        int index = 0;
        for(int i=0; i<len; i++){
            char a = str.charAt(i);
            boolean flag = true;
            for(int j=0; j<len; j++){
                
                char b = str.charAt(j);
                if(i!=j && a==b) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                unique[index] = a;
                    index++;
            }
        }
        char[] uniquechars = new char[index];
        
        for(int i=0; i<index;i++){
            uniquechars[i] = unique[i];
        }
        
        return uniquechars;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] unique = FindUnique(str);
        for(int i=0;i<unique.length;i++){
            System.out.println(unique[i]);
        }
        input.close();
    }
}