//3
//Create a program to find the maximum number of handshakes among N number of students.

import java.util.Scanner;
class handshake{

    public int combinations(int n){
        int combination = (n * (n - 1)) / 2;
        return combination;
    }
    public static void main(String[] args) {
        int numberofStudents;
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Students : ");
        numberofStudents = input.nextInt();

        handshake obj = new handshake();
        int comb = obj.combinations(numberofStudents);

        System.out.println(" The no of handshakes are : " + comb);
        input.close();
    }
}
