import java.io.*;

public class Codeup1059 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int a = Integer.parseInt(br.readLine());
    bw.append(String.valueOf(~a));
    br.close();
    bw.close();
  }
}
