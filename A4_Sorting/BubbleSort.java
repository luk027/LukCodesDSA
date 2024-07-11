package A4_Sorting;
import java.util.Random;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){

        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i] > arr[i+1]){
                    swapped = true;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        
        Random rand = new Random();
        int[] arr = new int[10];

        for(int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(30);
        }

        System.out.print("Before sort: ");
        for (int i : arr) {
            System.out.print("["+i+"] ");
        }

        int[] result = bubbleSort(arr);

        System.out.print("\nBubble sort: ");
        for (int i : result) {
            System.out.print("["+i+"] ");
        }
    }    
}