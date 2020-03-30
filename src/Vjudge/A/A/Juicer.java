package Vjudge.A.A;

import java.util.Scanner;

public class Juicer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        int result = 0 ;
        long accumlatedV = 0;
        for (int i = 0; i < n ; i++) {
            long v = sc.nextLong();
            if( v < b ){
                System.out.println(v+"==="+b);
                accumlatedV += v;
                System.out.println(accumlatedV);
                if(accumlatedV > d) {
                    System.out.println(accumlatedV);
                    result += 1;
                    accumlatedV=0;
                }
             }
        }

        System.out.println(result);


    }

}



