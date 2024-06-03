import java.util.Scanner;

public class a1_reverse_arr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr_1 = new int[n];

        System.out.println("Enter The elements of Array:");
        for(int i=0;i<n;i++){
            arr_1[i] = sc.nextInt();
        }

        System.out.println("-----Printing Array-----");
        printArr(arr_1);

        System.out.println();

        System.out.println("-----Reverse Array-----");
        revArr(arr_1);
        sc.close();
    }

    //Reverse String 
    public static void revArr(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        printArr(arr);
    }

    //method for printing array
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int element : arr) {
            System.out.print(" "+element+" ");
        }
        System.out.print("]");
    }
}


