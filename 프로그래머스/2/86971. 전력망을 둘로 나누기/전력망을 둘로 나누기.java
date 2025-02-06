import java.util.*;

// /나는 wires를 기반으로 그래프를 먼저 만들어준 후, 연결 요소들을 하나씩 끊어가면서 탐색했다

// 탐색은 bfs를 통해 했으며, bfs를 호출해서 한 연결망 당 연결된 송전탑의 갯수를 반환하고 두 전력망의 송전탑 개수의 최솟값을 비교하면서 업데이트하는 방식으로 해결했다

// 아무래도 n의 크기가 크지 않아서 요렇게 풀어도 통과할 수 있었던 것 같다!
class Solution {
    static boolean[] visit;
    static int[][] arr;
    public int solution(int n, int[][] wires) {
        int answer = 101;
        arr = new int[n+1][n+1];
        // 그래프 초기화
        for(int[] wire : wires) {
            int x = wire[0];
            int y = wire[1];
            arr[x][y] = arr[y][x] = 1;
        }

        // 전력망을 하나씩 끊어보면서 각각의 송전탑 개수 구하기
        int diff = 0;
        for(int[] wire : wires) {
            int x = wire[0];
            int y = wire[1];
            visit = new boolean[n+1];
            arr[x][y] = arr[y][x] = 0;
            diff = 0;
            for(int i=1;i<=n;i++) {
                if(!visit[i]) {
                    int count = bfs(i, n);
                    diff = Math.abs(diff-count);
                }
            }
            // 최솟값으로 업데이트
            if(answer > diff) {
                answer = diff;
            }
            arr[x][y] = arr[y][x] = 1;
        }

        return answer;
    }

    private static int bfs(int start, int n) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        int count = 1;
        while(!q.isEmpty()) {
            int next = q.poll();
            visit[next] = true;
            for(int i=1;i<=n;i++) {
                if(arr[next][i]==1 && !visit[i]) {
                    q.add(i);
                    visit[i] = true;
                    count++;
                }
            }
        }
        return count;
    }
}