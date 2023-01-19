package greedy;

import java.io.*;
import java.util.*;

public class Bj13305 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] distances = new int[N - 1];
    int[] prices = new int[N - 1]; // 마지막 주유소는 의미없으므로 제외

    StringTokenizer st;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N - 1; i++) {
      distances[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N - 1; i++) {
      prices[i] = Integer.parseInt(st.nextToken());
    }

    int result = 0;

    for (int i = 0; i < N;) {
      int lowerIndex = getLowerPriceIndex(prices, i);
      if (lowerIndex == -1) {
        result += prices[i] * distanceCalculator(distances, i);
        break;
      }
      result += prices[i] * distanceCalculator(distances, i, lowerIndex);
      i = lowerIndex;
    }

    bw.append(String.valueOf(result));
    bw.flush();
    br.close();
    bw.close();
  }

  public static int getLowerPriceIndex(int[] arr, int idx) {
    int result = -1;
    for (int i = idx + 1; i < arr.length; i++) {
      if (arr[idx] > arr[i]) {
        result = i;
        break;
      }
    }
    return result;
  }

  public static int distanceCalculator(int[] arr, int start) {
    int result = 0;
    for (int i = start; i < arr.length; i++) {
      result += arr[i];
    }
    return result;
  }

  public static int distanceCalculator(int[] arr, int start, int end) {
    int result = 0;
    for (int i = start; i < end; i++) {
      result += arr[i];
    }
    return result;
  }
}