class Solution {
    private static int max = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(k, dungeons, visited, 0, 0);
        return max;
    }
    
    private void dfs(int k, int[][] dungeons, boolean[] visited, int index, int count){
        
        if(dungeons.length==index){
            max=Math.max(max, count);
            return;
        }
        
        for(int i=0;i<dungeons.length;i++){
            if(visited[i]) continue;
            visited[i] = true;
            
            if(dungeons[i][0]<=k){
                dfs(k-dungeons[i][1], dungeons, visited, index+1, count+1);
            }else{
                dfs(k, dungeons, visited, index+1, count);
            }
            visited[i] = false;
        }
        return;
    }
}