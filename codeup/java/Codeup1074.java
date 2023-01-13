import java.io.*;

public class Codeup1074 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine());
    while (num > 0) {
      bw.append(String.valueOf(num--) + "\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
