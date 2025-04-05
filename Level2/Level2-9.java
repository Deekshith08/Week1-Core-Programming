//9
//Rewrite the above program to store the marks of the students in physics, chemistry,
// and maths in a 2D array and then compute the percentage and grade


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int numberOfStudents;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of Students : ");
        numberOfStudents = input.nextInt();

        
        double[] total = new double[numberOfStudents];
        int[][] marks = new int[numberOfStudents][3];
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
                marks[i][0] = phy;
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
                marks[i][1] = mat;
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
                marks[i][2] = chem;
            }
        }


        for (int i=0; i<numberOfStudents; i++){
            total[i] = marks[i][0]+marks[i][1]+marks[i][2];
            percentage[i] = (total[i]/300)*100;
            if(percentage[i]>=80) grades[i] = "A";
            else if(percentage[i]>=70 && percentage[i]<=79) grades[i] = "B";
            else if(percentage[i]>=60 && percentage[i]<=69) grades[i] = "C";
            else if(percentage[i]>=50 && percentage[i]<=59) grades[i] = "D";
            else if(percentage[i]>=40 && percentage[i]<=49) grades[i] = "E";
            else        grades[i] = "R";
        }
        for(int i=0; i<numberOfStudents; i++){
            System.out.print("The student " + (i+1) + " has scored a total of " + total[i] + " percentage of " + percentage[i] + " with grade " + grades[i] +"\n" );
        }
        
        input.close();
    }
}

