import java.io.*;

public class Codeup1066 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split(" ");
    for (String s : arr) {
      if (Integer.parseInt(s) % 2 == 0) {
        bw.append("even\n");
      } else {
        bw.append("odd\n");
      }
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
