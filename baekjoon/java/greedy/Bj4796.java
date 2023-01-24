import java.io.*;

public class Bj4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 1;
        while(true) {
            
            String[] tmp = br.readLine().split(" ");
            if(tmp[0].equals("0") && tmp[1].equals("0") && tmp[2].equals("0")) {
                break;
            }
            int L = Integer.parseInt(tmp[0]);
            int P = Integer.parseInt(tmp[1]);
            int V = Integer.parseInt(tmp[2]);
            
            int result = 0;
            int times = V / P;
            int left = V % P;
            result = times * L + (L < left ? L : left);
            bw.append("Case " + cnt++ + ": " + result + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
