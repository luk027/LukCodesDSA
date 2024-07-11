package Extra;

public class PrimeNumber {

    public static boolean isPrime(int num){
        if(num == 0 || num ==1 ){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){

        String result = isPrime(1) ? "Is Prime" : "Not Prime";
        System.out.println(result);
    }
}   