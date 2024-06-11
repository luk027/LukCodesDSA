public class A2_RemoveEvenIntFromArray {
    public static void main(String[] args) {
        int[] myArray = {97,70,27,10,1,20,14,5};
        PrintArrayMethod.PrintArray(myArray);

        //counting the even element
        int evenCount = 0;
        for (int i : myArray) {
            if(i%2==0){
                evenCount++;
            }
        }
        int[] evenArray = new int[evenCount];
        int evenIndex = 0;

        //removing even elements from the array
        System.out.print("Odd elements - [ ");
        for (int i : myArray) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
            else{
                evenArray[evenIndex++] = i;
            }
        }
        System.out.print("]");
        System.out.print("\nEven elements -");
        PrintArrayMethod.PrintArray(evenArray);

    }
}
