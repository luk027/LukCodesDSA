public class a2_find_max_and_min {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9};

        findMaxElement(arr);
        findMinElement(arr);
    }

    public static void findMaxElement(int[] arr){
        int temp = 0;
        for(int i=0; i<arr.length;i++){
            if(temp < arr[i]){
                temp = arr[i];
            }
        }
        System.out.println("Max value is: "+temp);
    }

    public static void findMinElement(int[] arr){
        int temp = 0;
        for(int i=0; i<arr.length;i++){
            if(temp > arr[i]){
                temp = arr[i];
            }
        }
        System.out.println("Min value is: "+temp);
    }
}