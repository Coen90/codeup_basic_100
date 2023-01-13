import java.io.*;
import java.util.*;

public class Codeup1090 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long startNum = Long.parseLong(st.nextToken());
    long bounce = Long.parseLong(st.nextToken());
    long cnt = Long.parseLong(st.nextToken());
    for (int i = 1; i < cnt; i++) {
      startNum *= bounce;
    }
    bw.append("" + startNum);
    bw.flush();
    br.close();
    bw.close();
  }
}