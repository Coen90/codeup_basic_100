import java.io.*;

public class Codeup1063 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split(" ");
    int a = Integer.parseInt(arr[0]);
    int b = Integer.parseInt(arr[1]);
    int result = a > b ? a : b;
    bw.append(String.valueOf(result));
    br.close();
    bw.close();
  }
}
