//4
/*Write a program to demonstrate NullPointerException. 
*/

class NullPointer{
    public static void generateException(){ 
        String s = null;
        System.out.println(s.length());
    }
    public static void handleException(){
        String s = null;
        try{
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("NullPointer Exception : " + e.getMessage());
        }
    }
    public static void main(String[] args){
        //generateException();
        handleException();
    }
}