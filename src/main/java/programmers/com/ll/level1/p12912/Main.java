package programmers.com.ll.level1.p12912;

import java.io.InputStream;

class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int min = Math.min(a,b);
        int max = Math.max(a,b);

        for(int i = min; i<=max;i++){
            answer = answer + i;
        }

        return answer;
    }
}