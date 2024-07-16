package A4_Sorting;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static int[] selectionSort(int[] arr){

        
        
        return arr;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i=0;i<arr.length;i++) {
            arr[i] = rand.nextInt(30);
        }
        System.out.println("Before:    "+Arrays.toString(arr));

        int[] result = selectionSort(arr);
        System.out.println("Selection: "+Arrays.toString(result));
        
    }
}