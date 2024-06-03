//WAP to find the 2nd largest element from an array
public class a3_find_secondLargest {
    public static void main(String[] args) 
    {
        int[] arr = {27,10,81,3,45,93,2,77};

        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element is: "+secondLargest);
    }
    
    public static int findSecondLargest(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest)
            {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
