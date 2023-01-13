import java.io.*;

public class Codeup1094 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int cnt = Integer.parseInt(br.readLine());
    String[] arr = br.readLine().split(" ");
    int[] book = new int[cnt];
    int i = cnt - 1;
    for (String s : arr) {
      book[i] = Integer.parseInt(s);
      i--;
    }
    for (int num : book) {
      bw.append(num + " ");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}