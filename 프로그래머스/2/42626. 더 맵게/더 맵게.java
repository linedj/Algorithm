import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> scovilles = new PriorityQueue<>();

        for (int level: scoville) {
            scovilles.add(level);
        }
        
        int mix = -1;
        int answer = 0;
        
        while (scovilles.peek() < K) {
            
        // 모든 음식의 스코빌 지수를 K이상으로 만들 수 없는 경우
            if (scovilles.size() < 2) { 
                return -1;
            } 
            
            int first = scovilles.poll();
            int second = scovilles.poll();
            mix = first + second * 2;
            scovilles.add(mix);
            answer++;
        }
        
        return answer;
    }
}