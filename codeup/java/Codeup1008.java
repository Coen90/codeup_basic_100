public class Codeup1008 {
  public static void main(String[] args) {
    final char[][] arr = {
        { '\u250C', '\u252C', '\u2510' },
        { '\u251C', '\u253C', '\u2524' },
        { '\u2514', '\u2534', '\u2518' }
    };
    StringBuilder sb = new StringBuilder();

    for (char[] uni : arr) {
      for (char c : uni) {
        sb.append(c);
      }
      sb.append("\n");
    }

    System.out.println(sb.toString());
  }
}
