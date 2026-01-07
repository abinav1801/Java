/*

1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: 
    Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: 
    Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
 

Constraints:
    1 <= nums.length <= 1000
    -10^6 <= nums[i] <= 10^6

*/

import java.util.Scanner;

public class leetcode1480{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size = input.nextInt();

        int[] nums = new int[size];

        System.out.print("Enter the array elements : ");
        for(int i = 0 ; i < size ; i++){
            nums[i] = input.nextInt();
        }

        int[] arr = new int[size];

        arr = runningSum(nums);

        System.out.print("The Answer is : ");
        for(int i = 0 ; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
        input.close();
    }

    static public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

}