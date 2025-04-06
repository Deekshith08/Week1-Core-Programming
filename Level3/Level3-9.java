//9
/* Create a program to display a calendar for a given month and year. The program should
take the month and year as input from the user and display the calendar for that month.
E.g. for 07 2005 user input, the program should display the calendar
*/

import java.util.Scanner;
class Calendar{
    public static String month(int month){
        String[] monthArr = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return monthArr[month-1];
    }
    public static int leapyear(int year){
        if((year%4 == 0 && year%100!=0) || year%400==0) return 29;
        else return 28;
    }
    public static int noofdays(int month,int year){
        int days=0;
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)  days = 31;
        else if (month==4 || month==6 || month==9 || month==11)  days = 30;
        else if (month==2) days=Calendar.leapyear(year);
        return days;
    }
    public static int firstDay(int m,int y,int d){
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31*m0 / 12) % 7;
        return d0;
    }
    public static void main(String[] args) {
        int month, year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month in number : ");
        month = input.nextInt();
        System.out.print("Enter year : ");
        year = input.nextInt();

        String monthName = Calendar.month(month);
        int noofdays = Calendar.noofdays(month, year);
        int firstDay = Calendar.firstDay(month, year, 1);

        System.out.println(monthName + " " + year);
        System.out.printf("%-7s%-7s%-7s%-7s%-7s%-7s%-7s\n","Sun","Mon","Tue","Wed","Thu","Fri","Sat");
        
        for(int i=0; i<firstDay; i++){
            System.out.printf("%-9s"," * ");
        }
        int DayofWeek = firstDay;
        for(int i=1; i<=noofdays;i++){
            System.out.printf("%-9d",i);
            DayofWeek++;
            if(DayofWeek%7==0) System.out.print("\n");
        }
        input.close();
    }
}