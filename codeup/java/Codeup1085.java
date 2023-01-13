
/*
h, b, c, s 가 공백을 두고 입력된다.
h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.
8 bit(비트)           = 1byte(바이트)     //       8bit=1Byte
1024 Byte(210 byte) = 1KB(킬로 바이트) // 1024bit=1KB
1024 KB(210 KB)      = 1MB(메가 바이트)
 */
import java.io.*;

public class Codeup1085 {
  public static void main(String[] args) throws IOException {
    final long BIT = 8;
    final long BYTE = 1024;
    final float KILO_BYTE = 1024.0f;
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split(" ");
    long tmp = 1L;
    for(String s: arr) {
        tmp *= Long.parseLong(s);
    }
    long result = tmp / BIT / BYTE;
    float num = float.
    result / KILO_BYTE;
    System.out.printf("%.1f MB", result);
    bw.flush();
    br.close();
    bw.close();
  }
}