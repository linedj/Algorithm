import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        // arr 배열을 순회하면서 중복된 값은 스킵하고 stack에 값 추가
        for (int i = 0; i < arr.length; i++) {
            // Stack이 비어있거나, 현재 값이 stack의 마지막 값과 다르면 stack에 추가
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        // Stack에서 값을 꺼내서 배열로 변환
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}