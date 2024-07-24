public class Butterfly {
    public static void main(String[] args) {
        int n = 4;

        // Upper side 
        for(int i=1;i<=n;i++){
            //left-side stars
            for(int j=1;j<=i;j++){ 
                System.out.print("*");
            }

            //spaces
            int space = 2*(n-i);
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }

            //right-side stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower side
        for(int i=n;i>=1;i--){
            //left-side stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            int space = 2*(n-i);
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }

            //right-side stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}