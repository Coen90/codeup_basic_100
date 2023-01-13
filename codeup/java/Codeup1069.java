import java.io.*;

public class Codeup1069 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();
    switch (str) {
      case "A":
        bw.append("best!!!");
        break;
      case "B":
        bw.append("good!!");
        break;
      case "C":
        bw.append("run!");
        break;
      case "D":
        bw.append("slowly~");
        break;
      default:
        bw.append("what?");
        break;
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
