import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;

        // 소요시간 기준으로 정렬할 우선순위 큐
        PriorityQueue<int[]> workQue = new PriorityQueue<>(new WorkComparator());
        // 요청시간 기준으로 정렬할 우선순위 큐
        PriorityQueue<int[]> inQue = new PriorityQueue<>(new RequestComparator());

        // 작업을 요청시간 기준으로 inQue에 추가
        for (int[] j : jobs) {
            inQue.add(j);
        }

        // inQue 또는 workQue가 비어 있지 않을 때까지 반복
        while (!inQue.isEmpty() || !workQue.isEmpty()) {
            // 현재 시간에 수행 가능한 작업들을 workQue로 이동
            while (!inQue.isEmpty() && inQue.peek()[0] <= time) {
                workQue.add(inQue.poll());
            }

            // 수행 가능한 작업이 없으면 시간을 다음 작업 요청 시간으로 변경
            if (workQue.isEmpty()) {
                time = inQue.peek()[0];
            } else {
                // 작업 큐에서 작업 하나를 꺼내어 처리
                int[] job = workQue.poll();
                answer += time + job[1] - job[0];
                time += job[1];
            }
        }

        // 평균값 계산
        return answer / jobs.length;
    }
}

// 소요시간 기준으로 정렬하기 위한 Comparator 클래스
class WorkComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[1] - o2[1]; // 소요시간 오름차순 정렬
    }
}

// 요청시간 기준으로 정렬하기 위한 Comparator 클래스
class RequestComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0]; // 요청시간 오름차순 정렬
    }
}