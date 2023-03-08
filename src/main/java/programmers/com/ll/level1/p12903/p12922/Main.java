package programmers.com.ll.level1.p12903.p12922;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) sb.append("수");
            else sb.append("박");
        }

        return sb.toString();
    }
}