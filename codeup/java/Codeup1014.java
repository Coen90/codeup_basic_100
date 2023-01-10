import java.util.Scanner;

public class Codeup1014 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(" ");
    sc.close();
    char[] charArr = new char[2];
    for (int i = 0; i < arr.length; i++) {
      charArr[i] = arr[i].charAt(0);
    }
    System.out.println(charArr[1] + " " + charArr[0]);
  }
}