import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] days = new int[progresses.length];
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0 ; i<progresses.length ; i++){
            int j = 1;
            while(progresses[i] + speeds[i] * j < 100){
                j++;
            }
            days[i] = j;
        }
        
        int delay = days[0];
        int count = 1;
        
        for(int i=1 ; i<days.length ; i++){
            
            if(delay>=days[i]){
                count++;
                
            }else if(delay<days[i]){
                delay=days[i];
                answer.add(count);
                count = 1;
            }
        }
        
        answer.add(count);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}