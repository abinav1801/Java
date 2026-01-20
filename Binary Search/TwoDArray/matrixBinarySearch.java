package TwoDArray;

import java.util.Scanner;

public class matrixBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Row size and Col Size of the array : ");
        int row_size = input.nextInt();
        int col_size = input.nextInt();

        int[][] arr = new int[row_size][col_size];
        System.out.print("Enter the elements in the array : ");
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j < col_size; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter the target : ");
        int target = input.nextInt();

        int[] ans = new int[1];
        ans = search(arr, target);

        System.out.print("The target index is : " + ans[0]);

        input.close();
    }

    static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[] {row , col};
            }
            if(arr[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }

}
