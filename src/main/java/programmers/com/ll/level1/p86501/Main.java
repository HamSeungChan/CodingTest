package programmers.com.ll.level1.p86501;

import java.util.Arrays;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {

        int[] s = new int[]{1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(new Solution().solution(s));

    }
}

class Solution {
    public int solution(int[] numbers) {

        int sum = IntStream.range(1,10)
                .sum();

        int numbersSum = Arrays.stream(numbers)
                .sum();

        return sum - numbersSum;
    }
}

class OtherSolution{
    public int solution(int[] numbers){
        return IntStream
                .range(1,10)
                .filter(i -> Arrays.stream(numbers).noneMatch(num -> i==num))
                .sum();
    }
}