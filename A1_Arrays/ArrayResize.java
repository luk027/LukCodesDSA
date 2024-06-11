public class ArrayResize {

    public static int[] resize(int[] arr,int capacity){
        int[] temp = new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] ar1 = new int[] {27,8,1};
        System.out.println("Size of original array: "+ar1.length);
        ar1 = resize(ar1, 8);
        System.out.println("Resize of original array: "+ar1.length);
    }
}
