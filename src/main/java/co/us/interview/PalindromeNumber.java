package co.us.interview;

public class PalindromeNumber {
    
    /*
    * Check whether the given number is palindrome or not
    * */
    public static void main(String[] args) {
        System.out.println("isPalindrome(121) = " + isPalindrome(121));
    }

    private static boolean isPalindrome(int number) {
        int result = 0;
        int orgNumber = number;
        while(number>0){
            int rightMostDigit = number%10;
            result=(result*10)+rightMostDigit;
            number = number/10;
        }
        System.out.println("original = " + orgNumber);
        System.out.println("result = " + result);
        System.out.println("number = " + number);

        return orgNumber==result;

    }
}
