import java.io.*;
import java.text.*;

public class Test {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = "a.b.c.d";
    String[] arr = str.split("\\.");
    System.out.println(arr.length);
    for (String s : arr) {
      System.out.print(s + " ");
    }
  }
}
