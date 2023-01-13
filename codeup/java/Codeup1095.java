import java.io.*;

public class Codeup1095 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int cnt = Integer.parseInt(br.readLine());
    String[] arr = br.readLine().split(" ");
    int result = Integer.MAX_VALUE;
    for (String s : arr) {
      if(result > Integer.parseInt(s)) {
          result = Integer.parseInt(s);
      }
    }
    bw.append(String.valueOf(result));
    bw.flush();
    br.close();
    bw.close();
  }
}