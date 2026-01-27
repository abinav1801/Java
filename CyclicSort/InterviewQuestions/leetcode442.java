/*

442. Find All Duplicates in an Array

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 

Constraints:
    n == nums.length
    1 <= n <= 105
    1 <= nums[i] <= n
    Each element in nums appears once or twice.

*/

package CyclicSort.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leetcode442 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        List<Integer> duplicates = findDuplicates(arr);
        System.out.println("Duplicates are: " + duplicates);
        for(int i = 0 ; i < duplicates.size() ; i++){
            System.out.print(duplicates.get(i) + " ");
        }

        input.close();
    }

    static List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        cyclicSort(arr);
        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index] != index + 1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1; //for the array starts from 0 if it starts from 1 use arr[i] - 1
            if(arr[i] != arr[correct]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
