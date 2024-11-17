import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int result= d.length;
        int sum=budget+1;
        Arrays.sort(d);
        while(sum>budget){
            sum = 0;
            for(int i=0; i<result;i++){
            sum+= d[i];
            }
            result--;
        }
        result++;
        return result;
    }
}