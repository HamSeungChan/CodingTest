package programmers.com.ll.level1.p12933;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(12346));
    }
}

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}