//13
/*Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and 
transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input 
and display the result of the operations.
 */

import java.lang.Math;
class MatrixManipulation{
    public static int[][] makematrix(int rows,int columns){
        int[][] matrix = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0;j<columns; j++){
                matrix[i][j] = (int)(Math.random()*10) + 1;
            }
        }
        return matrix;
    }
    public static int[][] addMatrix(int[][] mat1, int[][]mat2){
        int rows = mat1.length;
        int columns = mat1[0].length;
        int[][] sum = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                sum[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        return sum;
    }
    public static int[][] subtractMatrix(int[][] mat1, int[][]mat2){
        int rows = mat1.length;
        int columns = mat1[0].length;
        int[][] subtract = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                subtract[i][j] = mat1[i][j]-mat2[i][j];
            }
        }
        return subtract;
    }
    public static int[][] multiplyMatrix(int[][] mat1, int[][] mat2){
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int rows2 = mat2.length;
        int cols2 = mat2[0].length;
        int[][] multiply = new int[rows1][cols2];
        if(cols1==rows2){
            for(int i =0; i<rows1; i++){
                for(int j=0; j<cols2; j++){
                    int sum = 0;
                    for(int k=0; k<cols1; k++){
                        sum += mat1[i][k] * mat2[k][j];
                    }
                    multiply[i][j] = sum;
                }
            }
        }
        return multiply;
    }
    public static int[][] transposeMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }
    public static void main(String[] args) {
        int rows = 3,columns = 3;

        int[][] matrix1 = MatrixManipulation.makematrix(rows, columns);
        int[][] matrix2 = MatrixManipulation.makematrix(rows, columns);
        System.out.println("Matrix 1 : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrix1[i][j] + " ");              
            }
            System.out.println();
        }
        System.out.println("Matrix 2 : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrix2[i][j] + " ");              
            }
            System.out.println();
        }
        int[][] addition = MatrixManipulation.addMatrix(matrix1, matrix2);
        System.out.println("The resultant matrix of addition of two matrices is : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(addition[i][j] + " ");              
            }
            System.out.println();
        }

        int[][] multiplication = MatrixManipulation.multiplyMatrix(matrix1, matrix2);
        System.out.println("The resultant matrix of multiplication of two matrices is : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(multiplication[i][j] + " ");              
            }
            System.out.println();
        }

        int[][] transpose = MatrixManipulation.transposeMatrix(matrix1);
        System.out.println("The transpose matrix of matrix 1 is : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(transpose[i][j] + " ");              
            }
            System.out.println();
        }

    }
}
