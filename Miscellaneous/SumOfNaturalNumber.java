package Miscellaneous;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();
        sc.close();

        int answer = sumOf_N_NaturalNumber(n);
        System.out.printf("Sum of %d is: %d", n ,answer);
    }
    
    public static int sumOf_N_NaturalNumber(int n)
    {
        return n*(n+1)/2;
    }
}
