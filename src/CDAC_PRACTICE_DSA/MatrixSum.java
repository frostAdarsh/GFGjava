package CDAC_PRACTICE_DSA;

import java.util.Scanner;

public class MatrixSum {

    private static void maxRowCol(int[][] arr, int row, int col) {

        int maxRowIndex = 0;
        int maxRowSum = Integer.MIN_VALUE;

        int maxColIndex = 0;
        int maxColSum = Integer.MIN_VALUE;


        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int j = 0; j < col; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = i;
            }
        }


        for (int j = 0; j < col; j++) {
            int colSum = 0;
            for (int i = 0; i < row; i++) {
                colSum += arr[i][j];
            }
            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxColIndex = j;
            }
        }

        System.out.println("Row with maximum sum: " + maxRowIndex);
        System.out.println("Column with maximum sum: " + maxColIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        System.out.println("Enter the number of col");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the value");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              arr[i][j] = sc.nextInt();
            }
        }
        maxRowCol(arr,row,col);
    }
}
