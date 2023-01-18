import java.io.*;
import java.text.*;

public class Test {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String tmp = "0009+0009";
    int i = Integer.parseInt(tmp);
    System.out.println(i);

  }
}
