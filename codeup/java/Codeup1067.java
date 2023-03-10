import java.io.*;

public class Codeup1067 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine());
    if (num < 0) {
      bw.append("minus\n");
    } else {
      bw.append("plus\n");
    }
    if (num % 2 == 0) {
      bw.append("even\n");
    } else {
      bw.append("odd\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
