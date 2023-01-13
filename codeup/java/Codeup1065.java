import java.io.*;

public class Codeup1065 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split(" ");
    for (String s : arr) {
      if (Integer.parseInt(s) % 2 == 0) {
        bw.append(s + "\n");
      }
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
