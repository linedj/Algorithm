class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
	     int answer = Math.max(last(arrayB, lgcd(arrayA)), last(arrayA, lgcd(arrayB)));
  
		 return answer;
	 }
	 
     static int last(int[] arr, int g){
         int cand = g;
         for(int i : arr){
             if(i%g==0){
                 cand = 0;
             }
         }
         return cand;
     }
     
     static int lgcd(int[] array){
         int buf = array[0];
         for(int i=1;i<array.length;i++){
             buf=gcd(buf,array[i]);  
         }
         return buf;
     }
     static int gcd(int a, int b){
         if(a%b==0) return b;
         return gcd(b, a%b);
     }
    
}