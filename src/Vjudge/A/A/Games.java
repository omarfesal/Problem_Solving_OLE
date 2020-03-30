package Vjudge.A.A;

import java.util.Scanner;

public class Games {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int result = 0;
        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if(i!=j)
                    if (arr1[i] == arr2[j])
                        result++;
            }
        }


        System.out.println(result);
    }

}
