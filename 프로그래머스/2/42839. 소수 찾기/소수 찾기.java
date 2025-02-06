import java.util.*;
 
class Solution {
    
    final int MAX = 10000000;        
    int len = 0;
    HashSet<Integer> set = new HashSet<>();
    String[]  strNums = null;
    boolean[] visited = null;
    boolean[] primeList = new boolean[MAX];
    
    public int solution(String numbers) {
        primeList[0] = true;
        primeList[1] = true;
        for ( int i = 2; i < MAX; ++i ) {
            for ( int j = i + i; j < MAX; ) {
                primeList[j] = true;
                j += i;
            }
        }

        strNums = numbers.split("");
        len = strNums.length;
        visited = new boolean[len];
        
        getResult( 0, "" ); 
        
        return set.size();
    }
    
    // 에라토스테네스의 체 : 한번에 소수를 미리 구해둔다.
    // 종이 조각으로 만들 수 있는 모든 경의우의 소수를 구한다.
    public void getResult(int x, String strNum) {
        
        if ( strNum != "") {
            int num = Integer.parseInt( strNum );
            if ( !primeList[num] ) set.add( num );
        } 
        
        if ( x >= len ) return; 
        
        for ( int i = 0; i < len; ++i ) { 
            if ( visited[i] ) continue;
            visited[i] = true;
            getResult( x+1, strNum + strNums[i] );
            visited[i] = false; 
        }
        
    }

}