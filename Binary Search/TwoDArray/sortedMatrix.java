package TwoDArray;

import java.util.Scanner;

public class sortedMatrix {
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

    //search in the row provided btw the columns provided
    static int[] binarySearch(int[][] matrix , int row , int cStart , int cEnd , int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row , mid};
            }

            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1 , -1};
    }

    static int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        //run the loop till the 2 rows are remaining
        while(rStart < (rEnd - 1)){ //while this is true it will have more than 2 rows
            int middle = rStart + (rEnd - rStart) / 2;

            if(matrix[middle][cMid] == target){
                return new int[]{middle , cMid};
            }
            
            if(matrix[middle][cMid] < target){
                rStart = middle;
            }
            else{
                rEnd = middle;
            }
        }

        //now we have 2 rows
        //check whether the target is in the col of 2 rows

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart , cMid};
        }
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart , cMid};
        }

        //search in 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //search in 2nd half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        //search in 3rd half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        else{
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }   
    }

}
