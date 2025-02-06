import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        List<Integer> pass = new ArrayList<>();
        int[] student1 = {1, 2, 3, 4, 5};;
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = new int[3];
        for(int i=0;i<answers.length;i++){
            int answer = answers[i];
            
            if(student1[i%5] == answer) scores[0] += 1;
            if(student2[i%8] == answer) scores[1] += 1;
            if(student3[i%10] == answer) scores[2] += 1;
        }
        
        int max=0;
        
        for(int i:scores) {
            max=Math.max(i,max);
        }

        for(int i=0;i<3;i++){
            if(scores[i]==max) pass.add(i+1);
        }
        
        
        int[] result = new int[pass.size()];
            
        for(int i=0;i<pass.size();i++) {
            result[i]=pass.get(i);
        }
        
        return result;
        
    }
}