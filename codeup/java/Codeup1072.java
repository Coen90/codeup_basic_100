import java.io.*;

public class Codeup1072 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    br.readLine();
    String[] arr = br.readLine().split(" ");
    for (String s : arr) {
      bw.append(s + "\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
