class Solution {
    public int solution(int[] wallet, int[] bill) {
        int wsmall = Math.min(wallet[0],wallet[1]);
        int wbig = Math.max(wallet[0],wallet[1]);
        int answer = 0;
        while(true){
            int bsmall = Math.min(bill[0],bill[1]);
            int bbig = Math.max(bill[0],bill[1]);
            
            if(bsmall>wsmall||bbig>wbig){
                if(bill[0]>bill[1]) bill[0]/=2;
                else bill[1]/=2;
                answer++;
            }
            else break;
        }
        return answer;
    }
}