import java.io.*;

public class Codeup1096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[19][19];
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++) {
            String[] nums = br.readLine().split(" ");
            int x = Integer.parseInt(nums[0]) - 1;
            int y = Integer.parseInt(nums[1]) - 1;
            arr[x][y] = 1;
        }
        for(int[] arrs: arr) {
            for(int num: arrs) {
                bw.append(num + " ");
            }
            bw.append("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
