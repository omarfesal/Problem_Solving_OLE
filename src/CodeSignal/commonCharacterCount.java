package CodeSignal;

public class commonCharacterCount {

    public static void main(String[] args) {


        System.out.println(commonCharacterCount("abca","xyzbac"));
    }

    static int commonCharacterCount(String s1, String s2) {
        int[] st1 = new int[26];
        int[] st2 = new int[26];

        for(int x = 0 ; x < s1.length() ; x++){
            int st1i= s1.charAt(x) % 97;
            System.out.println(" 1=> " + st1i);
            st1[st1i] += 1;
        }
        for (int i = 0; i  < s2.length() ; i++) {
            int st2i= s2.charAt(i) % 97;
            System.out.println(" 2=> " + st2i);
            st2[st2i] += 1;

        }
        int result = 0;
        for (int i = 0; i < 26 ; i++) {
            System.out.println(st1[i] + " === " + st2[i]);
            result += Math.min(st1[i] , st2[i]);
        }

        return result;
    }


}
