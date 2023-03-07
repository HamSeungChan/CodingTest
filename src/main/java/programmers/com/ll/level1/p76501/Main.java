package programmers.com.ll.level1.p76501;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int[] arr) {

        if (arr.length <= 1)
            return new int[]{-1};

        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays
                .stream(arr)
                .filter(i -> i!=min)
                .toArray();
    }
}