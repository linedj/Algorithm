import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int answer = 1;             // 종류의 수
        int poke = nums.length/2;   // 가져갈 수 있는 포켓몬 개수
        
        Arrays.sort(nums);          // 포켓몬 종류를 세기위해 정렬
        
        int buf = nums[0];
        for(int i : nums){          // 종류 변화 카운팅
            if(buf != i) {
                buf = i;
                answer++;
            }
            if(answer>poke){        // 포켓몬 종류가 최대값을 초과하면 종료
                return poke;
            }
        }
        return answer;
    }
}