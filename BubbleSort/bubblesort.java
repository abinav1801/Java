package BubbleSort;

import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        
        bubbleSort(arr);
        
        System.out.println("Sorted array is:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        
        input.close();
    }

    static void bubbleSort(int[] arr){
        boolean swapped;

        for(int i = 0 ; i < arr.length ; i++){
            swapped = false;
            for(int j = 1 ; j < arr.length - i ; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if(swapped == false){
                break; //If the array is sorted and this is used to reduce time complexity
            }
        }
    }
}
