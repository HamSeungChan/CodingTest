package programmers.com.ll.level1.p77884;

import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(13,17));
    }
}

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int number = left; number <= right; number++) {
            int finalNumber = number;
            long count = IntStream.range(1,finalNumber+1)
                    .filter(i -> finalNumber % i ==0)
                    .count();
            System.out.println(count);
            if(count % 2 ==0 ) answer +=number;
            else answer -= number;
        }

        return answer;
    }
}
