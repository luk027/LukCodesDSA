package A2_String;

public class Palindrome {
    public static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int left = 0;
        int right = word.length()-1;
        while (left<right) {
            if(charArray[left] != charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String st = "level";
        String result = isPalindrome(st) ? "String is Palindrome" : "String not Palindrome";
        System.out.println(result);    
    }
}
