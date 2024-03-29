import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        
        for(int i = 0; i < priorities.length; i++) {
            pq.offer(priorities[i]);
        }
        
        while(!pq.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(priorities[i] == pq.peek()) {
                    pq.poll();
                    answer++;
                    if(i == location)   return answer;
                }
            }
        }
        return answer;
    }
}