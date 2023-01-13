import java.io.*;

public class Codeup1078 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int startNum = 1;
    int endNum = Integer.parseInt(br.readLine());
    int result = 0;
    while (startNum <= endNum) {
      if (startNum % 2 == 0) {
        result += startNum;
      }
      startNum++;
    }
    bw.append(String.valueOf(result));
    bw.flush();
    br.close();
    bw.close();
  }
}
