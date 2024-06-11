package Miscellaneous;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        int n = 99999;

        int answer = sumOf_N_NaturalNumber(n);
        System.out.println("sum is: "+answer);
        System.out.println("Time taken: "+(System.currentTimeMillis() - now)+ " millisecs.");
    }
    
    public static int sumOf_N_NaturalNumber(int n)
    {
        return n*(n+1)/2;
    }

    // public static int sumOf_N_NaturalNumber(int n)
    // {
    //     int sum = 0;
    //     for(int i=0;i<=n;i++)
    //     {
    //         sum+=i;
    //     }
    //     return sum;
    // }
}
