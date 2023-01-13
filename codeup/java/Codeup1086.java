import java.io.*;

public class Codeup1086 {
  public static void main(String[] args) throws IOException {
    final long BIT = 8;
    final long BYTE = 1024;
    final float KILO_BYTE = 1024.0f;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split(" ");
    long tmp = 1L;
    for (String s : arr) {
      tmp *= Long.parseLong(s);
    }
    long longVal = tmp / BIT / BYTE;
    float result = longVal / KILO_BYTE;
    System.out.printf("%.2f MB", result);
    bw.flush();
    br.close();
    bw.close();
  }
}