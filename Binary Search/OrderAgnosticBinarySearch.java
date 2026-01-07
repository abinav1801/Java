import java.util.Scanner;

public class OrderAgnosticBinarySearch {
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

        int ans = OrderAgnosticBS(arr, target);


        if(ans == -1){
            System.out.print("The Target Element is not found.");
        }
        else{
            System.out.print("The Target Element Index is " + ans);
        }
        input.close();
    }

    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // int middle = (start + end) / 2; //might be possible to exceed the java int
            // range
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAsc) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else if (target < arr[middle]) {
                    start = middle + 1;
                }

            }

        }

        return -1;

    }
}
