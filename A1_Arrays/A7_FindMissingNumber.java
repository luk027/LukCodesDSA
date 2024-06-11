public class A7_FindMissingNumber {

    public static int findMissingNumber(int[] arr){
        int n = arr.length+1;
        int expectedValue = n*(n+1)/2;
        for (int i : arr) {
            expectedValue = expectedValue - i;
        }
        return expectedValue;
    }
    public static void main(String[] args) {
        int[] arr7 = {2,4,1,8,6,3,7};
        PrintArrayMethod.PrintArray(arr7);

        int ans = findMissingNumber(arr7);
        System.out.println(ans);

    }
}
