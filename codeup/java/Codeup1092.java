import java.io.*;
import java.util.*;

public class Codeup1092 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int day = 1;
    while (day % a != 0 || day % b != 0 || day % c != 0) {
      day++;
    }
    bw.append("" + day);
    bw.flush();
    br.close();
    bw.close();
  }
}