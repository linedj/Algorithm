class Solution {
    public int solution(int[] arr) {
        int cnt=0;
        boolean end = true;
        while(end){
            cnt++;
            end = false;
            for(int i=0;i<arr.length;i++){
                if(cnt%arr[i]!=0) end = true;
            }
        }
        return cnt;
    }
}