//6
//Write a program SpringSeason that takes two int values month and day from the command 
//line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 

import java.util.Scanner;
class SpringSeason{
    public boolean checkSpring(int month,int day){
        if (month==3 && (day>=20 && day<=30)){
            return true;
        }
        else if ((month==4 || month==5) && (day>=1 && day<=30)){
            return true;
        }
        else if (month==3 && (day>=1 && day<=20)){
            return true;
        }
        else{return false;}
    }
    public static void main(String[] args) {
        int month,day;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month in number : ");
        month = input.nextInt();
        System.out.print("Enter date : ");
        day = input.nextInt();
        
        SpringSeason obj =new SpringSeason();
        boolean res = obj.checkSpring(month, day);
        if (res==true) System.out.println("Its a Spring Season");
        else System.out.println("Its not a Spring Season");
        input.close();
    }
}


