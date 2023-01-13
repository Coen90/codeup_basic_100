import java.io.*;

public class Codeup1080 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine());
    int result = 0;
    int cnt = 0;
    while(true) {
      result += cnt;
      if(result > num) {
          break;
      }
      if(result == num) {
          break;
      }
      cnt++;
    }
    bw.append(String.valueOf(cnt));
    bw.flush();
    br.close();
    bw.close();
  }
}
