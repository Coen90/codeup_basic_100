import java.io.*;

public class Codeup1068 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine());
    if (num <= 100 && num >= 90) {
      bw.append("A");
    } else if (num < 90 && num >= 70) {
      bw.append("B\n");
    } else if (num < 70 && num >= 40) {
      bw.append("C\n");
    } else if (num < 40 && num >= 0) {
      bw.append("D\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
