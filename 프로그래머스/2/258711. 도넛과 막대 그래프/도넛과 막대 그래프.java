import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        Map<Integer, Integer> out = new HashMap<>();
        Map<Integer, Integer> in = new HashMap<>();
        
        for (int[] edge : edges) {
            out.put(edge[0], out.getOrDefault(edge[0], 0) + 1);
            in.put(edge[1], in.getOrDefault(edge[1], 0) + 1);
        }
        
        int[] answer = new int[4];
        
        for (int node : out.keySet()) {
            int outVal = out.get(node);
            int inVal = in.getOrDefault(node, 0);
            
            if (outVal > 1 && inVal == 0) {
                answer[0] = node; // 생성 정점
            } else if (outVal > 1 && inVal >= 1) {
                answer[3]++; // 8자 중앙 정점 개수
            }
        }
        
        for (int node : in.keySet()) {
            if (!out.containsKey(node)) {
                answer[2]++; // 막대 그래프 끝 정점 개수
            }
        }
        
        answer[1] = out.get(answer[0]) - answer[2] - answer[3];
        
        return answer;
    }
}