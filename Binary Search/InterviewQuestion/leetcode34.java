/*

34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
 
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:
    0 <= nums.length <= 105
    -109 <= nums[i] <= 109
    nums is a non-decreasing array.
    -109 <= target <= 109

*/

package InterviewQuestion;

import java.util.Scanner;

public class leetcode34 {
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
            if(i != 0 && arr[i] < arr[i - 1]){
                System.out.print("This is not a sorted array. We cannot perform binary search.");
                input.close();
                return;
            }
        }

        System.out.print("Enter the target element : ");
        int target = input.nextInt();

        int[] ans = searchRange(arr, target);

        System.out.print("The Ceiling Element is : " + ans[0] + " and " + ans[1]);

        input.close();

	}

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int start = search(nums,target,true);
        int end = search(nums , target , false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] arr , int target , boolean findFirstIndex){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            //int middle = (start + end) / 2; //might be possible to exceed the java int range
            int middle = start + (end - start) / 2;

            if(target < arr[middle]){
                end = middle - 1;
            }
            else if(target > arr[middle]){
                start = middle + 1;
            }
            else{
                ans = middle;
                if(findFirstIndex){
                    end = middle - 1;
                }
                else{
                    start = middle + 1; 
                }
            }
        }

        return ans;
    }
    
}
