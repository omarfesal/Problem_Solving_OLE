package CodeSignal;

import java.util.ArrayList;
import java.util.List;

public class allLongestStrings {
    public static void main(String[] args) {
        System.out.println(allLongestStrings(new String[]{"aba", "aa", "ad", "vcd", "aba"}).length);

    }

    static String[] allLongestStrings(String[] inputArray) {
        int max = 0;
        List result = new ArrayList<String>();
        for (int i = 0; i < inputArray.length ; i++) {
            if(inputArray[i].length() > max){
                max = inputArray[i].length();
                result.clear();
                result.add(inputArray[i]);
            }else if(inputArray[i].length() == max){
                result.add(inputArray[i]);
            }
        }
        String str[] = new String[result.size()];
        for(int x = 0 ; x < str.length ; x++){
            str[x] = (String) result.get(x);
            System.out.println(str[x]);
        }
        return str;
    }


}
