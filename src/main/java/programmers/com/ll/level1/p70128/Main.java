package programmers.com.ll.level1.p70128;

import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }

        return answer;
    }
}

class OtherSolution {
    public int solution(int[] a, int[] b) {

        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}