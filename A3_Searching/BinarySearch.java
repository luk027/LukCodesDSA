package A3_Searching;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int data){
        int low = 0;
        int high = arr.length-1;

        while (low<=high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == data){
                return mid;
            }

            if(arr[mid] < data){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {8,12,45,53,86,87,90};
        for (int i : arr) {
            System.out.print("["+i+"] ");
        }

        System.out.println("\nEnter element to search: ");
        int data = sc.nextInt();
        sc.close();

        int result = binarySearch(arr,data);
        if(result != -1){
            System.out.println("Element "+data+" present at "+result+" position.");
        }
        else{
            System.out.println("Element "+data+" is not present!");
        }
    }
}
