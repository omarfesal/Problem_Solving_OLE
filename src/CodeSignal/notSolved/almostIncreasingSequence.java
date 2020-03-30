package CodeSignal.notSolved;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class almostIncreasingSequence {
    public static void main(String[] args) {

        System.out.println(almostIncreasingSequence(new int[]{1, 1, 2, 3, 4, 4}));

    }

    static boolean almostIncreasingSequence(int[] sequence) {
        Set sequenseSet = new HashSet<Integer>();

        int count = 0;
        int prevElem = sequence[0];
        sequenseSet.add(prevElem);
        for (int i = 1; i < sequence.length ; i++) {
            if(!sequenseSet.add(sequence[i])){
                if(++count > 1) return false;
                continue;
            }else if(sequence[i] < prevElem){
                if(++count>1) return false;
            }
            prevElem = sequence[i];
        }
        return true;
    }

}
