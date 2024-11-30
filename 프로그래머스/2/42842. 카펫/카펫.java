class Solution {
    public int[] solution(int brown, int yellow) {

        int row=0;
        while(true){
            row++;
            if(2*row*row-4*row-brown*row+2*yellow+2*brown==0) break;
        }

        
        int[] answer = {(brown-2*row)/2+2,row};
        return answer;
    }
}