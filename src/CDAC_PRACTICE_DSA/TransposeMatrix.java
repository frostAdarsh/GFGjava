package CDAC_PRACTICE_DSA;

import java.util.Scanner;

public class TransposeMatrix {

    private static void transposeMatrix(int[][] arr, int row, int col) {

        System.out.println("Transpose of matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of row");
        int row = sc.nextInt();
        System.out.println("Enter the size of col");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter the values");
        for (int i = 0; i < row; i++) {
            for (int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("print matrix");

        for (int i = 0; i < row; i++) {
            for (int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

        transposeMatrix(arr,row,col);

    }


}

