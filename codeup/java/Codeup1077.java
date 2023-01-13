import java.io.*;

public class Codeup1077 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int startNum = 0;
    int endNum = Integer.parseInt(br.readLine());
    while (startNum <= endNum) {
      bw.append(String.valueOf(startNum++) + "\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
