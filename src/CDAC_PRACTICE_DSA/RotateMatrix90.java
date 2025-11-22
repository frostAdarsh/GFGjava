package CDAC_PRACTICE_DSA;

import java.util.Scanner;

public class RotateMatrix90 {

    private static void rotateMatrix90(int[][] arr, int row ,int col) {

        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]=temp;
            }
        }

        for (int i = 0; i < row; i++) {
            int start = 0, end = row - 1;

            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }

        System.out.println("Matrix rotated by 90 degrees:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
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

        rotateMatrix90(arr,row,col);

    }



}

