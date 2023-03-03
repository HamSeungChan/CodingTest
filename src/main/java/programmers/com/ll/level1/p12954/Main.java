package programmers.com.ll.level1.p12954;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();   //x는 -10000000 이상, 10000000 이하인 정수입니다.
        int n = sc.nextInt();   //n은 1000 이하인 자연수입니다.
    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long lx =x ;
        for (int i = 0; i < n; i++) {
            answer[i] = lx;
            lx += x;
        }
        return answer;
    }
}