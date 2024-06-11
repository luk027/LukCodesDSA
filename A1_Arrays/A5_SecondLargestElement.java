public class A5_SecondLargestElement {
    public static void main(String[] args) {
        int[] arr5 = {1,2,3,4,5,6,7,8,};
        PrintArrayMethod.PrintArray(arr5);

        int largerst = Integer.MIN_VALUE;
        int secondLargerst = Integer.MIN_VALUE;

        for(int i=0;i<arr5.length;i++){
            if(arr5[i] > largerst){
                secondLargerst = largerst;
                largerst = arr5[i];
            }
            else if(arr5[i] > secondLargerst && arr5[i] != largerst){
                secondLargerst = arr5[i];
            }
        }
        System.out.println("Largert element is: "+ largerst);
        System.out.println("Second largert element is: "+ secondLargerst);
    }
}
