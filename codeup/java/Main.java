import java.io.*;

/*
타로는 자주 JOI잡화점에서 물건을 산다. 
JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 
언제나 거스름돈 개수가 가장 적게 잔돈을 준다. 
타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 
받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
*/

public class Main {
  public static void main(String[] args) throws IOException {
    final int MONEY = 1_000;
    final int[] OTSURI = { 500, 100, 50, 10, 5, 1 };
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int price = MONEY - Integer.parseInt(br.readLine());
    int result = 0;

    System.out.println("price : " + price);

    for (int i = 0; i < OTSURI.length; i++) {
      if (price == 0) {
        break;
      }
      result += price / OTSURI[i];
      price = price % OTSURI[i];
      System.out.println(i + "번째 result : " + result);
      System.out.println(i + "번째 price : " + price);
    }

    bw.append(String.valueOf(result));
    bw.flush();
    br.close();
    bw.close();
  }
}