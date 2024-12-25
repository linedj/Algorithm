import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, String> numMap = new HashMap<>();
        
        for(int i=0 ; i < phone_book.length ; i++){
            numMap.put(phone_book[i],phone_book[i]);
        }
        
        for(int i=0 ; i < phone_book.length ; i++){
            for(int j=1 ; j < phone_book[i].length() ; j++){
                if(numMap.containsKey(phone_book[i].substring(0,j))) return false;
            }
        }
        return true;
    }
}