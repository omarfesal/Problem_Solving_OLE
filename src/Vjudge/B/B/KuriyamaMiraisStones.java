package Vjudge.B.B;

import java.util.Scanner;

public class KuriyamaMiraisStones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long NormArr[] = new long[n+2];
        long accNormArr[] = new long[n+2];

        for (int i = 1; i < n+2 ; i++) {
            NormArr[i] = sc.nextInt();
            accNormArr[i]  = accNormArr[i-1] + NormArr[i];
        }
    // each line
        for(int x = 0 ; x < m ; x++){
            int type = sc.nextInt();
            int L = sc.nextInt();
            int R = sc.nextInt();
            if(type == 1){
                System.out.println(accNormArr[R] - accNormArr[L-1]);
            }else{
                System.out.println("5ara");
            }

        }



    }


}
