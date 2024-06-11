public class A3_ReverseAnArray {
    public static void main(String[] args) {
        int[] arr3 = {0,1,2,3,4,5,6,7,8,9,};
        PrintArrayMethod.PrintArray(arr3);

        int left = 0;
        int right = arr3.length-1;

        while(left < right) 
        {
            int temp = arr3[right];
            arr3[right] = arr3[left];
            arr3[left] = temp;

            left++;
            right--;
        }
        System.out.print("Reverse- ");
        PrintArrayMethod.PrintArray(arr3);

    }
}
