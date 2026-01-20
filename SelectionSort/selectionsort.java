package SelectionSort;

import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of elements in the array: ");
            int size = input.nextInt();
            
            int[] arr = new int[size];
            
            System.out.println("Enter the elements of the array:");
            for(int i = 0 ; i < size ; i++){
                arr[i] = input.nextInt();
            }
            
            selectionSort(arr);
            
            System.out.println("Sorted array is:");
            for(int i = 0 ; i < arr.length ; i++){
                System.out.print(arr[i] + " ");
            }
            
            input.close();
    }

    static void selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
        //find the max items in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr , 0 , last);
            swap(arr , maxIndex , last);
        }

    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr , int start , int end){
        int max = start;

        for(int i = start ; i <= end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }    
        return max;
    }

}
