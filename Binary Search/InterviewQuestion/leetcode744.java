/*

744. Find Smallest Letter Greater Than Target

You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: 
    The smallest character that is lexicographically greater than 'a' in letters is 'c'.

Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: 
    The smallest character that is lexicographically greater than 'c' in letters is 'f'.

Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: 
    There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 

Constraints:
    2 <= letters.length <= 104
    letters[i] is a lowercase English letter.
    letters is sorted in non-decreasing order.
    letters contains at least two different characters.
    target is a lowercase English letter.

*/

package InterviewQuestion;

import java.util.Scanner;

public class leetcode744 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        if(size <= 0){
            System.out.print("Enter the valid size.");
            input.close();
            return;
        }

        char[] arr = new char[size];
        System.out.print("Enter the elements in the array : ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.next().charAt(0);
        }

        System.out.print("Enter the target element : ");
        char target = input.next().charAt(0);
        char ans = nextGreatestLetter(arr, target);

        System.out.print("The Ceiling Element is : " + ans);

        input.close();
    }

    static char nextGreatestLetter(char[] arr, char target) {
        
        
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target < arr[middle]){
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
            
        }

        return arr[start % arr.length];
    }
}
