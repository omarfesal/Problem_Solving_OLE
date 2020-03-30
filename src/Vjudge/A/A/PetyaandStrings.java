package Vjudge.A.A;

import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        System.out.println( s.compareTo(s2) > 0 ? 1 : s.compareTo(s2) < 0 ? -1 : 0  );

    }
}
