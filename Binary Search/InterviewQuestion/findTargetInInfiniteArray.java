/*

Find position of an element in a sorted array of infinite numbers

Given a sorted array arr[] of infinite numbers. The task is to search for an element k in the array.

Examples:

Input: arr[] = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170], k = 10
Output: 4
Explanation: 
    10 is at index 4 in array.

Input: arr[] = [2, 5, 7, 9], k = 3
Output: -1
Explanation: 
    3 is not present in array.

Note: 
    Since the array is infinite, therefore, we can’t use arr.length to find the size of the array.

*/

package InterviewQuestion;

import java.util.Scanner;

public class findTargetInInfiniteArray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the array elements : ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target : ");
        int target = input.nextInt();

        int ans = targetIndex(arr , target);

        System.out.print("The target index is : " +  ans);
        input.close();
    }

    static int targetIndex(int[] arr , int target){
        int start = 0;
        int end = start + 1;
        while(true){
            if(target > arr[end]){
                int temp = end + 1;
                end = (end - start + 1) * 2 + end;
                start = temp;
            }
            else{
                break;
            }
        }

        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target > arr[middle]){
                start = middle + 1;
            }
            else if(target < arr[middle]){
                end = middle - 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }

}
