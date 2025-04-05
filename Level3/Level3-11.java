//11
/*Create a program to find the bonus of 10 employees based on their years of service as 
well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along
with the old and new salary.
 */
import java.lang.Math;
class BonusofEmployees{

    public static int[][] SalaryAndService(int number){
        int[][] arr = new int[number][2];
        for(int i=0; i<number; i++){
            arr[i][0] = (int)(Math.random()*90000 + 10000);
            arr[i][1] = (int)(Math.random()*10 + 1);
        }
        return arr;
    }
    public static int[][] updatedBonus(int[][] arr){
        int[][] upArr = new int[arr.length][2];
        int bonus = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i][1]>5){
                bonus = (int)(0.05*arr[i][0]);
                upArr[i][1] = bonus;
            }
            else if(arr[i][1]<=5){
                bonus = (int)(0.02*arr[i][0]);
                upArr[i][1] = bonus;
            }
            upArr[i][0] = arr[i][0]+bonus;
        }
        return upArr;
    }
    public static int[] totalSum(int[][] arr, int[][] upArr){
        int oldSalary = 0;
        int newSalary = 0;
        int totalBonus = 0;
        for(int i=0; i<arr.length; i++){
            oldSalary += arr[i][0];
            newSalary += upArr[i][0];
            totalBonus += upArr[i][1];
        }
        int[] total = {oldSalary,newSalary,totalBonus};
        return total;
    }
    public static void main(String[] args) {
        int number = 10;

        int[][] employeesArr = BonusofEmployees.SalaryAndService(number);
        int[][] updatedArr = BonusofEmployees.updatedBonus(employeesArr);
        int[] total = BonusofEmployees.totalSum(employeesArr, updatedArr);
        System.out.printf("%-10s%-15s%-20s%-15s%-15s%-15s\n", "EmpID", "Years of Service", "Old Salary", "Bonus", "New Salary", "Bonus %");
        System.out.println("---------------------------------------------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            double bonusPercent = employeesArr[i][1] > 5 ? 5 : 2;
            System.out.printf("%-10d%-15d%-20d%-15d%-15d%-15.2f%%\n",
                    (i + 1),
                    employeesArr[i][1],
                    employeesArr[i][0],
                    updatedArr[i][1],
                    updatedArr[i][0],
                    bonusPercent
            );
        }

        System.out.println("\nTotal Bonus Payout: " + total[2]);
        System.out.println("Total Old Salary: " + total[0]);
        System.out.println("Total New Salary: " + total[1]);
    }
}