package Extra;

public class demo {

    public  boolean checkPrime(int num){
        int i = 2;
        if(num == 0 || num == 1){
            return false;
        }
        while (i < num) {
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

        demo de = new demo();

        String result = de.checkPrime(11) ? "prime" : "Not Prime";
        System.out.println(result);
    }   
}