/*

1929. Concatenation of Array

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: 
    The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
        - ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: 
    The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
        - ans = [1,3,2,1,1,3,2,1]
 

Constraints:
    n == nums.length
    1 <= n <= 1000
    1 <= nums[i] <= 1000

*/

import java.util.Scanner;

public class leetcode1929 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size = input.nextInt();

        int[] nums = new int[size];

        System.out.print("Enter the array elements : ");
        for(int i = 0 ; i < size ; i++){
            nums[i] = input.nextInt();
        }

        int[] arr = new int[2 * size];

        arr = getConcatenation(nums);

        System.out.print("The Answer is : ");
        for(int i = 0 ; i < 2 * size ; i++){
            System.out.print(arr[i] + " ");
        }
        
        input.close();
    }

    static public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        
        for(int count = 0 ; count < 2 ; count++){
            for(int i = 0 ; i < nums.length ; i++){
                if(count == 0){
                    ans[i] = nums[i];
                }
                else if(count == 1){
                    ans[i + nums.length] = nums[i];
                }
            }
        }

        return ans;
    }

}
