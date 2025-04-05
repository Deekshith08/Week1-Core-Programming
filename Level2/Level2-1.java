//1
//Create a program to find the bonus of 10 employees based on their years of service and
// the total bonus amount the company Zara has to pay, along with the old and new salary.

import java.util.Scanner;
class bonus{
    public static void main(String[] args) {
        int number = 10;
        double[] salary = new double[number];
        int[] yearsofService = new int[number];
        double[] newSalary = new double[number];
        double[] bonusAmount = new double[number];
        Scanner input = new Scanner(System.in);
        double totalBonus=0;
        double totalNewSalary =0;
        double totalOldSalary = 0;

        for(int i=0; i<number; i++){
            System.out.print("Enter the salary of employee " + (i+1) + " : ");
            double x = input.nextInt();
            if(x<=0){
                System.out.print("Enter a valid number : ");
                i--;
                continue;
            }
            else{
                salary[i] = x;
            }
        }
        for(int i=0; i<number; i++){
            System.out.print("Enter the years of service of employee " + (i+1) + " : ");
            int x = input.nextInt();
            if(x<0){
                System.out.print("Enter a valid number : ");
                i--;
                continue;
            }
            else{
                yearsofService[i] = x;
            }
        }

        for(int i=0; i<number;i++){
            if(yearsofService[i]>5){
                bonusAmount[i] = (5.0/100.0)*salary[i];
            }
            else if(yearsofService[i]<=5){
                bonusAmount[i] = (2.0/100.0)*salary[i];
            }
            newSalary[i] = salary[i]+bonusAmount[i];
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        for(int i=0; i<number; i++){
            System.out.print("Details of Employee " + (i+1) +" : \n");
            System.out.print("Bonus amount : " + bonusAmount[i] + "\n");
            System.out.print("Old Salary : " + salary[i] + "\n");
            System.out.print("New Salary : " + newSalary[i] + "\n");
        }
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        input.close();
    }
}