import java.util.*;

class Solution {
    
    class Music{
        int index;
        String genre;
        int play;
        boolean visited;
        Music(int i, String g, int p){
            this.index = i;
            this.genre = g;
            this.play = p;
        }
    }
        
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        ArrayList<Music> musicList = new ArrayList<>();
        
        for(int i=0 ; i<genres.length ; i++){
            hashMap.put(genres[i],hashMap.getOrDefault(genres[i],0)+plays[i]);
            musicList.add(new Music(i, genres[i], plays[i]));
        }
        
        Collections.sort(musicList,(m1,m2)->(m2.play-m1.play));
        
        ArrayList<Map.Entry<String,Integer>> genreList = new ArrayList<>(hashMap.entrySet());
        Collections.sort(genreList,(m1,m2)->(m2.getValue()-m1.getValue()));
        
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i=0;i<genreList.size();i++){
            int cnt = 0;
            for(int j=0 ; j<musicList.size(); j++){
                if(musicList.get(j).visited) continue;
                if(musicList.get(j).genre.equals(genreList.get(i).getKey())){
                    answerList.add(musicList.get(j).index);
                    musicList.get(j).visited = true;
                    cnt++;
                }
                if(cnt==2) break;
            }
        }
        
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}