
//8
//Create a program to convert distance in kilometers to miles.



import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter no of km");
        km = input.nextDouble();
        double miles = km/1.6;
        

        
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}