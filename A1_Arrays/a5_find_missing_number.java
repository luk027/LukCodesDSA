public class a5_find_missing_number {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5,6,8,9};
        int ans = findMissingNumber(arr1);
        System.out.println(ans);
    }

    public static int findMissingNumber(int[] arr)
    {
        int n = arr.length;
        int expextedSum = n*(n+1)/2;
        int actualSum = 0;

        for (int i : arr) {
            actualSum+=i;
        }
        return expextedSum - actualSum;
    }
}