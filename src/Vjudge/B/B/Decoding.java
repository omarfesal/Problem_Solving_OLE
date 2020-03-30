package Vjudge.B.B;

import java.util.Scanner;

public class Decoding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reminder = sc.nextInt();
        String s = sc.next();
        int pointer = 0;
        String res = "";
        while (reminder > 0 ){
            if(reminder % 2 == 0 )
                res = s.charAt(pointer) + res;
            else
                res += s.charAt(pointer);

            pointer++;
            reminder--;
        }

        System.out.println(res);



    }

}
