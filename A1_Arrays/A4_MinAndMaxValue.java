public class A4_MinAndMaxValue {

    public static int FindMaxValue(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max = arr[i];
            }
        }return max;
    }

    public static int FindMinValue(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                min = arr[i];
            }
        }return min;
    }

    public static void main(String[] args) {
        int[] a4 = {24,6,99,75,2,87,4,3,98,1027};
        PrintArrayMethod.PrintArray(a4);
        System.out.println("Max Element is: "+FindMaxValue(a4));
        System.out.println("Min Element is: "+FindMinValue(a4));
    }
}
