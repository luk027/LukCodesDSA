public class InvertedHalfPiramid {
    public static void main(String[] args) {
      int n = 6;

      for(int i=1;i<=n;i++){

        // space 
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // star 
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
      }
    }
}
