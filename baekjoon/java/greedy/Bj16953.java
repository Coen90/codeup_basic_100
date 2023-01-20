package greedy;

import java.io.*;
import java.util.*;

public class Bj16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        String end = st.nextToken();
        int cnt = 1;
        while (true) {
            int tmp = 0;
            if ("1".equals(end.substring(end.length() - 1))) {
                end = end.substring(0, end.length() - 1);
                tmp = Integer.parseInt(end);
                cnt++;
            } else {
                tmp = Integer.parseInt(end);
                if (tmp % 2 == 1) {
                    cnt = -1;
                    break;
                } else {
                    tmp /= 2;
                    end = String.valueOf(tmp);
                    cnt++;
                }
            }
            if (tmp == start) {
                break;
            }
            if (tmp < start || tmp == 1) {
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}