import java.io.*;

public class Codeup1076 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    char startChar = 'a';
    char endChar = br.readLine().charAt(0);
    while ((int) startChar <= (int) endChar) {
      bw.append(startChar++ + " ");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
