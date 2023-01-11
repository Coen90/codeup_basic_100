import java.util.Scanner;

public class Codeup1026 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String time = sc.nextLine().split(":")[1];
    System.out.print(time.charAt(0) == '0' ? time.charAt(1) : time);
    sc.close();
  }
}
