import java.util.*;

class Solution {
    
    static final int[][] DIRS = { { 1, 0 }, { 0, -1 }, { 0, 1 }, { -1, 0 } }; // 하 좌 상 우
    
    public int solution(int[][] maps) {
        int n = maps.length; // map row
        int m = maps[0].length; // map col
        int startRow = 0, startCol = 0, endRow = maps.length - 1, endCol = maps[0].length - 1;
        int[][] costs = new int[n][m];
        boolean[][] isVisited = new boolean[n][m];
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startRow, startCol, 1});
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int row = curr[0], col = curr[1], cost = curr[2];
            costs[row][col] = cost;
            if(row == endRow && col == endCol) {
                return costs[row][col];
            }
            for(int i = 0; i < DIRS.length; i++) {
                int nextRow = DIRS[i][0] + row;
                int nextCol = DIRS[i][1] + col;
                if(nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m) {
                    continue;
                }
                if(maps[nextRow][nextCol] == 0) { // 벽이면 패스
                    continue;
                }
                if(isVisited[nextRow][nextCol]) { // 방문했던곳이면 패스
                    continue;
                }
                isVisited[nextRow][nextCol] = true;
                q.add(new int[]{nextRow, nextCol, cost + 1});
                
            }
        }
        return -1;
    }
}
