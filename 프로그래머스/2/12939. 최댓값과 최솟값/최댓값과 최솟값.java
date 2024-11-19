import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] input = s.split(" ");
        String big = input[0];
        String small = input[input.length-1];
        for(int i=0;i<input.length;i++){
            if(Integer.valueOf(big)<Integer.valueOf(input[i])){
                big = input[i];
            }
            if(Integer.valueOf(small)>Integer.valueOf(input[i])){
                small = input[i];
            }
        }
        
        String answer = small+" "+big;
        return answer;
    }
}