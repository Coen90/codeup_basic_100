import java.io.*;

public class Codeup1081 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split(" ");
    int n = Integer.parseInt(arr[0]);
    int m = Integer.parseInt(arr[1]);
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        bw.append(i + " " + j + "\n");
      }
    }
    bw.flush();
    br.close();
    bw.close();
  }
}