import java.io.*;

public class Codeup1083 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int cnt = Integer.parseInt(br.readLine());
    for (int i = 1; i <= cnt; i++) {
      if (i == 3 || i == 6 || i == 9) {
        bw.append("X ");
      } else {
        bw.append(String.valueOf(i) + " ");
      }
    }
    bw.flush();
    br.close();
    bw.close();
  }
}