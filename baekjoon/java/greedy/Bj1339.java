package greedy;

import java.io.*;
import java.util.*;

public class Bj1339 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] alpha = new int[26];

        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            int base = (int) Math.pow(10, tmp.length() - 1);
            for (int j = 0; j < tmp.length(); j++) {
                alpha[tmp.charAt(j) - 'A'] += base;
                base /= 10;
            }
        }

        Arrays.sort(alpha);

        int result = 0;
        int max = 9;
        for (int i = alpha.length - 1; i > alpha.length - 10; i--) {
            result += alpha[i] * max;
            max--;
        }

        System.out.println(result);
    }
}
