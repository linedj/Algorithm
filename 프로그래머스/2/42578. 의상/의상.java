import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int len = clothes.length;
        HashMap<String, Integer> matches = new HashMap<>();
        
        for(int i = 0; i < len; i++) {
            String kind = clothes[i][1];    //의상 종류
            //KEY = 의상 종류, VALUE = 같은 종류를 같은 옷의 개수
            matches.put(kind, matches.getOrDefault(kind, 0) + 1); 
        }
        
        int answer = 1;
        
        for(String key: matches.keySet()) { //조합 경우의 수
            answer *= matches.get(key) + 1;
        }
        return answer - 1;
        
    }
}