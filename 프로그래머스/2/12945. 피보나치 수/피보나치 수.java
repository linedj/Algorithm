class Solution {
    public int solution(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        int cnt = 1;      
        while(cnt<n){
            c = a%1234567 + b%1234567;
            a = b;
            b = c;
            cnt++;
        }
        int answer = c%1234567;
        return answer;
    }
}