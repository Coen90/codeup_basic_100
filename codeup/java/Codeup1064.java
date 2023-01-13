import java.io.*;

public class Codeup1064 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split(" ");
    int a = Integer.parseInt(arr[0]);
    int b = Integer.parseInt(arr[1]);
    int c = Integer.parseInt(arr[2]);
    int result = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
    bw.append(String.valueOf(result));
    br.close();
    bw.close();
  }
}
