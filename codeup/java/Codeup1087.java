import java.io.*;

public class Codeup1087 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine());
    int result = 0;
    int cnt = 1;
    while (num > result) {
      result += cnt;
      cnt++;
    }
    bw.append("" + result);
    bw.flush();
    br.close();
    bw.close();
  }
}