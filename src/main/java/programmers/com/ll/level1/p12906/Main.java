package programmers.com.ll.level1.p12906;

import java.util.*;

class Main {
    public static void main(String[] args) {
        int [] array = new int[]{1,1,3,3,0,1,1};

        for(int x : new Solution().solution(array)){
            System.out.println(x);
        }
    }
}


class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i : arr){
            if(stack.isEmpty()) stack.push(i);
            if(stack.peek()!=i) stack.push(i);
        }

        int [] answer = new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}