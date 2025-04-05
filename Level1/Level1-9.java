//9
//Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int rows,columns;
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter no of rows : ");
        rows = input.nextInt();

        System.out.print("Enter no of columns : ");
        columns = input.nextInt();
        int[][] Arr2d = new  int[rows][columns];
        int[] Arr1d = new int[rows*columns];

        for (int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print("Enter Arr3d[" + i + "][" + j + "] : ");
                Arr2d[i][j] = input.nextInt();
            }
        }

        int index=0;
        for (int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                Arr1d[index] = Arr2d[i][j];
                index++;
            }
        }

        System.out.print("The elements trasferred to 2d array are : \n");
        for(int i=0; i<(Arr1d.length); i++){
            System.out.print(Arr1d[i]+" \n");
        }
        input.close();
    }
}
