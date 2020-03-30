package Vjudge.B.B;

import java.util.Scanner;

public class LovelyPalindromes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder intial = new StringBuilder(sc.next());
        String result = intial.toString();
        StringBuilder s = intial.reverse();
        result += s.toString();
        System.out.println(result);
    }
}
