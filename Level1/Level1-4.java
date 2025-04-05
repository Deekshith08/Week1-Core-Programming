//4
/*An athlete runs in a triangular park with sides provided as input by the user in meters. 
If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
 */

import java.util.Scanner;
class triangularPark{
    public static int noofRounds(int side1,int side2,int side3){
        int perimeter = side1+side2+side3;
        int rounds = perimeter/5000;
        return rounds;
    }
    public static void main(String[] args) {
        int side1,side2,side3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side : ");
        side1 = input.nextInt();
        System.out.print("Enter second side : ");
        side2 = input.nextInt();
        System.out.print("Enter third side : ");
        side3 = input.nextInt();

        int rounds = triangularPark.noofRounds(side1, side2, side3);
        System.out.println("No of rounds to complete 5km run : " + rounds);
        input.close();
    }
}
