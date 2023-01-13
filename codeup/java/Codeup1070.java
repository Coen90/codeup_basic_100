import java.io.*;

public class Codeup1070 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int month = Integer.parseInt(br.readLine());
    switch (month) {
      case 12:
      case 1:
      case 2:
        bw.append("winter");
        break;
      case 3:
      case 4:
      case 5:
        bw.append("spring");
        break;
      case 6:
      case 7:
      case 8:
        bw.append("summer");
        break;
      case 9:
      case 10:
      case 11:
        bw.append("fall");
        break;
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
