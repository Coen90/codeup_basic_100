import java.io.*;

public class Codeup1053 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine());
    boolean result = num == 1 ? true : false;
    bw.append(result == true ? "0" : "1");
    br.close();
    bw.close();
  }
}
