package Vjudge.B.B;

import java.io.*;
import java.util.StringTokenizer;

public class EasterEggs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int count = sc.nextInt();

        char colors[] = {'R','O','Y','G', 'B','I','V'};
        StringBuilder res= new StringBuilder("");
        for (int i = 0; i < count ; i++) {
            if(i%2==0)
                res.append( colors[i%7] );
            else
                res.insert(0, colors[i%7]);

        }
            out.print(res);
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