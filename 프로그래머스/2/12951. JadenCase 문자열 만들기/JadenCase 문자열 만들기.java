class Solution {
    public String solution(String s) {
        
	    s=s.toLowerCase();
	    String[] word = s.split("");
	    for(int i=1;i<word.length;i++){
	        if(word[i-1].equals(" ")){
	            word[i]=word[i].toUpperCase();
	                
	        }
	    }
	    word[0]=word[0].toUpperCase();
	    String answer = "";
	    for(String w:word) answer+=w;

        return answer;
    }
}