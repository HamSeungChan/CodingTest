package programmers.com.ll.level1.p87389;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 2;i<n;i++){
            if(n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}