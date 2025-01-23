import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        String[] str = Arrays.stream(numbers)
                             .mapToObj(String::valueOf)
                            //3과 30을 비교하면 330과 303을 비교
                             .sorted((a, b) -> (b + a).compareTo(a + b))
                             .toArray(String[]::new);
        
        if (str[0].equals("0")) {
            return "0";
        }

        for (String s : str) {
            answer.append(s);
        }
        
        return answer.toString();
    }
}