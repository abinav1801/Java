/*

33. Search in Rotated Sorted Array

There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:
    1 <= nums.length <= 5000
    -104 <= nums[i] <= 104
    All values of nums are unique.
    nums is an ascending array that is possibly rotated.
    -104 <= target <= 104

*/

package InterviewQuestion;

import java.util.Scanner;

public class leetcode33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        if(size <= 0){
            System.out.print("Enter the valid size.");
            input.close();
            return;
        }

        int[] arr = new int[size];
        System.out.print("Enter the elements in the array : ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the target element : ");
        int target = input.nextInt();

        int ans = rotatedArray(arr, target);


        System.out.print("The target index is " + ans);
        input.close();
    }

    static int rotatedArray(int[] arr , int target){

        int pivot = findPivot(arr);

        if(pivot == -1){
            return binarySearch(arr , target , 0 , arr.length - 1);
        }

        if(arr[pivot] == target){
            return pivot;
        }

        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int findPivot(int[] arr){
        
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){

            int middle = start + (end - start) / 2;

            if(middle < end && arr[middle] > arr[middle + 1]){
                return middle;
            }
            if(middle > start && arr[middle] < arr[middle - 1])
            {
                return middle - 1;
            }
            if(arr[middle] <= arr[start]){
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }

        return -1;
    }

    static int binarySearch(int[] arr , int target , int start , int end){

        while(start <= end){
            //int middle = (start + end) / 2; //might be possible to exceed the java int range
            int middle = start + (end - start) / 2;

            if(arr[middle] == target){
                return middle;
            }
            if(target < arr[middle]){
                end = middle - 1;
            }
            else if(target > arr[middle]){
                start = middle + 1;
            }
        }

        return -1;
    }

}
