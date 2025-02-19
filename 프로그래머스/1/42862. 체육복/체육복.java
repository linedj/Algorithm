import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        for (int i : lost) {
            for (int k = 0; k < reserve.length; k++) {
                int min = i - reserve[k];
                if (min == -1 || min == 1) {
                    answer++;
                    reserve[k] = -1;
                    break;
                }
            }
        }		
        
        return answer;
    }
}