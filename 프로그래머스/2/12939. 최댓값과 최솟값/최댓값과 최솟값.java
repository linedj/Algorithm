import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] input = s.split(" ");
        int[] nums = new int[input.length];
        
        for(int i=0;i<input.length;i++){
            nums[i]=Integer.valueOf(input[i]);
        }
        Arrays.sort(nums);
        String answer = nums[0]+" "+nums[nums.length-1];
        
        return answer;
    }
}