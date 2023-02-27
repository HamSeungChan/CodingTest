package programmers.com.ll.level1.p12916;

class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("pPoooyY"));
    }
}

class Solution {
    boolean solution(String s) {

        s = s.toUpperCase();

        int pCount = 0, yCount = 0;
        for (char x : s.toCharArray()) {
            if (x == 'P') pCount++;
            if (x == 'Y') yCount++;
        }

        if (pCount != yCount) return false;

        return true;
    }
}