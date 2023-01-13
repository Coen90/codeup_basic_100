import java.io.*;

public class Codeup1079 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split(" ");
    for (String s : arr) {
      bw.append(s + "\n");
      if ("q".equals(s)) {
        break;
      }
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
