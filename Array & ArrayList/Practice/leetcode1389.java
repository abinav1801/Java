/*

1389. Create Target Array in the Given Order

Given two arrays of integers nums and index. Your task is to create target array under the following rules:

    Initially target array is empty.
    From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    Repeat the previous step until there are no elements to read in nums and index.

Return the target array.

It is guaranteed that the insertion operations will be valid.

Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
    nums       index     target
    0            0        [0]
    1            1        [0,1]
    2            2        [0,1,2]
    3            2        [0,1,3,2]
    4            1        [0,4,1,3,2]
Example 2:

Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
    nums       index     target
    1            0        [1]
    2            1        [1,2]
    3            2        [1,2,3]
    4            3        [1,2,3,4]
    0            0        [0,1,2,3,4]
Example 3:

Input: nums = [1], index = [0]
Output: [1]
 

Constraints:
    1 <= nums.length, index.length <= 100
    nums.length == index.length
    0 <= nums[i] <= 100
    0 <= index[i] <= i

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leetcode1389{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int size = input.nextInt();

        int[] nums = new int[size];

        System.out.print("Enter the array elements : ");
        for(int i = 0 ; i < size ; i++){
            nums[i] = input.nextInt();
        }

        System.out.print("Enter the array of index : ");
        int[] index = new int[size];

        for(int i = 0 ; i < size ; i++){
            index[i] = input.nextInt();
        }


        int[] arr = new int[size];

        arr = createTargetArray(nums , index);

        System.out.print("The Answer is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        input.close();
    }

    static public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            target.add(index[i] , nums[i]);
        }

        int[] result = new int[target.size()];
        for(int i = 0 ; i < target.size() ; i++)
        {
            result[i] = target.get(i);
        }

        return result;
    }

}