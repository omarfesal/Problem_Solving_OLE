package CodeSignal;

import java.util.Arrays;

public class makeArrayConsecutive2 {
    public static void main(String[] args) {

            makeArrayConsecutive2(new int[] {6, 2, 3, 8});

    }


    static int makeArrayConsecutive2(int[] statues) {
        Arrays.sort(statues);
        int len =statues.length;
        int min = statues[0];
        int max = statues[len-1];
        return (max-min+1)-len;
    }

}
