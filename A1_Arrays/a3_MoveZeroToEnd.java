public class a3_MoveZeroToEnd {
    public static void main(String[] args) {
        
        int[] arr = {1,0,3,0,5};
        int n = arr.length;
        int lastNonZeroFoundAt = 0; 

        System.out.println("BEFORE-------------");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            if(arr[i] != 0)
            {
                arr[lastNonZeroFoundAt++] = arr[i]; 
            }
        }

        System.out.print(lastNonZeroFoundAt);
        for(int i=lastNonZeroFoundAt;i<n;i++)
        {
            arr[i] = 0;
        }
        System.out.println("AFTER--------------");
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
