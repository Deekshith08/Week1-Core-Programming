//8
//Create a program to take input marks of students in 3 subjects physics, chemistry, and 
//maths. Compute the percentage and then calculate the grade  as per the following 
//guidelines 

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int numberOfStudents;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of Students : ");
        numberOfStudents = input.nextInt();

        int[] physics = new int[numberOfStudents];
        int[] chemistry = new int[numberOfStudents];
        int[] maths = new int[numberOfStudents];
        double[] marks = new double[numberOfStudents];
        double[] percentage = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        int phy, chem, mat;
        for (int i=0; i<numberOfStudents; i++){
            System.out.print("Enter physics marks of student " + (i+1) + " out of 100 : ");
            phy = input.nextInt();
            if(phy<0){
                System.out.print("Enter positive values \n");
                i--;
                continue;
            }
            else{
                physics[i] = phy;
            }
        }
        for (int i=0; i<numberOfStudents; i++){
            System.out.print("Enter maths marks of student " + (i+1) + " out of 100 : ");
            mat = input.nextInt();
            if(mat<0){
                System.out.print("Enter positive values \n");
                i--;
                continue;
            }
            else{
                maths[i] = mat;
            }
        }
        for (int i=0; i<numberOfStudents; i++){
            System.out.print("Enter chemistry marks of student " + (i+1) + " out of 100 : ");
            chem = input.nextInt();
            if(chem<0){
                System.out.print("Enter positive values \n");
                i--;
                continue;
            }
            else{
                chemistry[i] = chem;
            }
        }

        for (int i=0; i<numberOfStudents; i++){
            marks[i] = physics[i]+chemistry[i]+maths[i];
            percentage[i] = (marks[i]/300)*100;
            if(percentage[i]>=80) grades[i] = "A";
            else if(percentage[i]>=70 && percentage[i]<=79) grades[i] = "B";
            else if(percentage[i]>=60 && percentage[i]<=69) grades[i] = "C";
            else if(percentage[i]>=50 && percentage[i]<=59) grades[i] = "D";
            else if(percentage[i]>=40 && percentage[i]<=49) grades[i] = "E";
            else        grades[i] = "R";
        }
        for(int i=0; i<numberOfStudents; i++){
            System.out.print("The student " + (i+1) + " has scored a total of " + marks[i] + " percentage of " + percentage[i] + "with grade " + grades[i] +"\n" );
        }
        input.close();
    }
}
