package Vjudge.A.A;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ShaassandOskols {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int len = sc.nextInt();
        int birdCount[] = new int[len];

        birdCount = Arrays.stream(birdCount).map(x->{
            x = sc.nextInt();
            return x;
        }).toArray();

        int m = sc.nextInt();
        for (int i = 0; i < m  ; i++) {
            int xi = sc.nextInt()-1;
            int yi = sc.nextInt();
            if(xi+1 < len)
                birdCount[xi+1] += birdCount[xi] -yi;
            if(xi-1 >= 0)
                birdCount[xi-1] += yi -1;
            birdCount[xi] = 0;
        }

        for(int x = 0 ; x < len ; x++)
            out.println(birdCount[x]);
        out.flush();
    }




    static class Scanner {
        StringTokenizer tokenizer;
        BufferedReader reader;

        public Scanner(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public boolean ready() throws IOException {
            return reader.ready();
        }
    }

}
