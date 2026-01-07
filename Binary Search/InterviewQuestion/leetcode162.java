/*

162. Find Peak Element

A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 
    3 is a peak element and your function should return the index number 2.

Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: 
    Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 

Constraints:
    1 <= nums.length <= 1000
    -231 <= nums[i] <= 231 - 1
    nums[i] != nums[i + 1] for all valid i.

*/

package InterviewQuestion;

import java.util.Scanner;

public class leetcode162 {
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

        int ans = findPeakElement(arr);

        System.out.print("The Peak Index is " + ans);
        
        input.close();
    }

    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int middle = start + (end - start) / 2;

            if(arr[middle] > arr[middle + 1]){
                end = middle;
            }
            else{
                start = middle + 1;
            }
        }

        return start;
    }
    
}
