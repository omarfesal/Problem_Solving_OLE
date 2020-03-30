package CodeSignal;

public class checkPalindrome {
    public static void main(String[] args) {

        System.out.println(checkPalindrome("abbbba"));
    }

    static boolean checkPalindrome(String inputString) {
        int len = inputString.length();
        StringBuilder st1 = new StringBuilder(inputString.substring(0,len/2));
        StringBuilder st2 = new StringBuilder(inputString.substring((int)Math.ceil(len/2d),len)).reverse();
        return  st1.toString().equals(st2.toString());
    }
}
