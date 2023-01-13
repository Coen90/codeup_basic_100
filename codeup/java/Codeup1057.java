import java.io.*;

public class Codeup1057 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split(" ");
    boolean a = arr[0].equals("1") ? true : false;
    boolean b = arr[1].equals("1") ? true : false;
    bw.append(a == b ? "1" : "0");
    br.close();
    bw.close();
  }
}
