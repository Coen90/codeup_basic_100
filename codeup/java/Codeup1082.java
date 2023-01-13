import java.io.*;

public class Codeup1082 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine(), 16);
    for (int i = 1; i < 16; i++) {
      bw.append(Integer.toHexString(num).toUpperCase() + "*" + Integer.toHexString(i).toUpperCase() + "="
          + Integer.toHexString(num * i).toUpperCase() + "\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}