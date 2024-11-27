class Solution {
    public int solution(int n) {
        String input = Integer.toBinaryString(n);
        int icnt = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='1') icnt++;
        }
        int comp = n;
        while(true){
            comp++;
            int bcnt = 0;
            String test = Integer.toBinaryString(comp);
            for(int i=0;i<test.length();i++){
                if(test.charAt(i)=='1') bcnt++;
            }
            if(bcnt==icnt){
                break;
            }
        }
        int answer = comp;
        return answer;
    }
}