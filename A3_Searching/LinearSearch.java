package A3_Searching;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int data){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {12,35,74,22,90,44,2,87,61};
        System.out.println(Arrays.toString(arr));

        
        System.out.print("\nEnter element to search: ");
        int data = sc.nextInt();
        sc.close();

        int result = linearSearch(arr, data);
        if(result != -1){
            System.out.println("Element " +data+ " is found at "+result+ " position.");
        }
        else{
            System.out.println("Element " +data+ " is not found.");
        }
    }
}