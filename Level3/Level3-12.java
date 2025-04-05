//12
/* Create a program to take input marks of students in 3 subjects physics, chemistry, and 
maths. Compute the total, average, and the percentage score 
*/

import java.util.Scanner;
import java.lang.Math;
class ScoreCard{
    public static int[][] pcmscores(int numberofStudents){
        int[][] scores = new int[numberofStudents][3];
        for(int i=0; i<numberofStudents; i++){
            for(int j=0; j<3; j++){
                scores[i][j] = (int)(Math.random()*91 + 10);
            }
        }
        return scores;
    }
    public static int[][] calculations(int[][] pcmscores){
        int[][] finalResults = new int[pcmscores.length][3];
        for(int i=0;i<pcmscores.length; i++){
            int total = 0;
            for(int j=0;j<3;j++){
                total += pcmscores[i][j];
            }
            int avg = total/3;
            int percentage =(int)(((double)total/300)*100);
            finalResults[i][0] = Math.round(total);
            finalResults[i][1] = Math.round(avg);
            finalResults[i][2] = percentage;
        }
        return finalResults;
    }
    public static void main(String[] args) {
        int numberofStudents;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of students : ");
        numberofStudents = input.nextInt();

        int[][] marks = ScoreCard.pcmscores(numberofStudents);
        int[][] results = ScoreCard.calculations(marks);
        String[] grades = new String[numberofStudents];
        for(int i=0; i<numberofStudents;i++){
            int percentage = results[i][2];
            if(percentage >=80) grades[i]="A";
            else if(percentage<=79 && percentage>=70) grades[i]="B";
            else if(percentage<=69 && percentage>=60) grades[i]="C";
            else if(percentage<=59 && percentage>=50) grades[i]="D";
            else if(percentage<=49 && percentage>=40) grades[i]="E";
            else grades[i]="R";
        }

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "StudentId","Physics","Chemistry","Maths","Total","Average","Percentage","Grade");
        System.out.println("-----------------------------------------------------------");
        
        for(int i=0; i<numberofStudents; i++){
            System.out.printf("%-15d%-15d%-15d%-15d%-15d%-15d%-15d%-15s\n",
                            (i+1),
                            marks[i][0],
                            marks[i][1],
                            marks[i][2],
                            results[i][0],
                            results[i][1],
                            results[i][2],
                            grades[i]
                            );
        }
        input.close();
    }
}
