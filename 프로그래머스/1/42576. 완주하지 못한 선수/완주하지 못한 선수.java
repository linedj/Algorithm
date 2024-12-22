import java.util.HashSet;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashSet<String> marathon = new HashSet<>();
        
        for (String p: participant) {
            if(!marathon.contains(p)) marathon.add(p);  //참가자 저장
            else marathon.remove(p);                    //동명이인 발생시 set에서 삭제
        }
        

        for (String c: completion) {
            if (marathon.contains(c)) marathon.remove(c); //완주자 set에서 삭제
            else marathon.add(c);   //동명이인 추가
        }
        
        for (String ans: marathon) return ans; //hashset에 이름이 남은 인원이 낙오자

        return null;
    }
}