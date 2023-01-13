import java.io.*;
import java.util.*;

public class Codeup1093 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // int cnt = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] book = new int[23];
    while (st.hasMoreTokens()) {
      book[Integer.parseInt(st.nextToken()) - 1]++;
    }
    for (int i : book) {
      bw.append(i + " ");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}