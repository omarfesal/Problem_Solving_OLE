package Vjudge.A.A;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        outer:
        for(int x = 1 ; x <= 5 ; x++)
            for(int y = 1 ; y <= 5 ; y++)
                if(sc.nextInt() == 1) {System.out.print(Math.abs(3-x) + Math.abs(3-y)); break outer;}
    }

}
