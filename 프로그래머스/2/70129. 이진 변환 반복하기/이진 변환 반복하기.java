import java.lang.Integer;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")){
            int cnt = 0;
            for(char c:s.toCharArray()){
                if(c=='0') answer[1]++;
                else cnt++;
            }
            s = Integer.toBinaryString(cnt);
            answer[0]++;
        }
        
        
        return answer;
    }
}