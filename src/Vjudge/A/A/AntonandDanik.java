package Vjudge.A.A;

import java.util.Scanner;

public class AntonandDanik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String games = sc.next();
        int A = (int) games.chars().filter(ch->ch=='A').count();
        int D = (int) games.chars().filter(ch->ch=='D').count();
        System.out.println(A > D ? "Anton" : D > A ? "Danik" : "Friendship" );

    }
}
