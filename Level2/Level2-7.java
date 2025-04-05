//7
/*Write a program to take user input for the age of all 10 students in a class and
check whether the student can vote depending on his/her age is greater or equal to 18.
 */

import java.util.Scanner;
class StudentVoteChecker{
    public boolean canStudentVote(int age){
        if(age>=18) return true;
        else return false;
    }
    public static void main(String[] args) {
        int n = 10;
        Scanner input = new Scanner(System.in);
        int[] age = new int[n];
        for(int i=0; i<age.length; i++){
            System.out.print("Enter age of student " + (i+1) + " : ");
            age[i] = input.nextInt();
            if(age[i]<=0){
                System.out.println("Entered age is not valid");
                i--;
                continue;
            }
        }
        StudentVoteChecker obj = new StudentVoteChecker();
        for(int i=0; i<age.length; i++){
            boolean res = obj.canStudentVote(age[i]);
            if (res==true) System.out.println("The student " + (i+1) + " is eligible to vote");
            else System.out.println("The student " + (i+1) + " is not eligible to vote");
        }
        input.close();
    }
}


