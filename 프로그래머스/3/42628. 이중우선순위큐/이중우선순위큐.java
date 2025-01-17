import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> maxq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minq = new PriorityQueue<>();
        
        for (String op : operations) {
            String[] cmd = op.split(" ", 2);
            int num = Integer.parseInt(cmd[1]);

            switch (cmd[0]) {
                case "I":
                    minq.add(num);
                    maxq.add(num);
                    break;
                case "D":
                    if (num == 1 && !maxq.isEmpty()) {
                        minq.remove(maxq.poll());
                    } else if (num == -1 && !minq.isEmpty()) {
                        maxq.remove(minq.poll());
                    }
                    break;
            }
        }
        
        int[] answer = {0, 0};
        if (!minq.isEmpty() && !maxq.isEmpty()) {
            answer[0] = maxq.poll();
            answer[1] = minq.poll();
        }
        
        return answer;
    }
}