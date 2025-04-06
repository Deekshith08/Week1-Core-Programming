//8
/*Write a program to take user input for the age of all 10 students in a class and check whether the student can 
vote depending on his/her age is greater or equal to 18. */


import java.lang.Math;
class VoteValidation{
    public static int[] RandomAges(int n){
        int[] ages = new int[n];
        for(int i=0; i<n; i++){
            ages[i] =(int)(Math.random()*25 + 1);
        }
        return ages;
    }
    public static String[][] VoteOrNot(int[] ages){
        String[][] resArr = new String[ages.length][2];
        for(int i=0; i<resArr.length;i++){
            resArr[i][0] = Integer.toString(ages[i]);
            if(ages[i]>=18) resArr[i][1] = "true";
            else  resArr[i][1] = "false";
        }
        return resArr;
    }
    public static void main(String[] args){
        int n=10;
        int[] ages = VoteValidation.RandomAges(n);
        String[][] result = VoteValidation.VoteOrNot(ages);
        System.out.printf("%-15s%-15s%-15s","StudentId","Age","Can vote?\n");
        System.out.println("-------------------------------");
        for(int i=0; i<result.length; i++){
            System.out.printf("%-15s%-15s%-15s\n",
                            (i+1),
                            ages[i],
                            result[i][1]);
        }
    }
}