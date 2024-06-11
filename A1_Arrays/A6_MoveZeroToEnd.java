public class A6_MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr6 = {0,18,45,11,0,27,99,0};
        PrintArrayMethod.PrintArray(arr6);
        int lastElement = 0;
        for(int i=0;i<arr6.length;i++){
            if (arr6[i]!=0) {
                arr6[lastElement] =arr6[i];
                lastElement++;
            }
        }
        for(int i=lastElement;i<arr6.length;i++){
            arr6[i] = 0;
        }

        PrintArrayMethod.PrintArray(arr6);
    }
}
