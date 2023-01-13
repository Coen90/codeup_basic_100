import java.io.*;

public class Codeup1060 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split(" ");
    int a = Integer.parseInt(arr[0]);
    int b = Integer.parseInt(arr[1]);
    bw.append(String.valueOf(a & b));
    br.close();
    bw.close();
  }
}
