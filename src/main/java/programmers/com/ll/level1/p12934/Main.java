package programmers.com.ll.level1.p12934;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;

        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
                break;
            } else answer = -1;
        }
        return answer;
    }
}
