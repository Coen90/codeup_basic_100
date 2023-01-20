package greedy;

import java.io.*;

public class Bj1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char start = str.charAt(0);// 0
        char now = str.charAt(0);// 0
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != now) {
                now = str.charAt(i);
                if (str.charAt(i) != start) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        br.close();
    }
}