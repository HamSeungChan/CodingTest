package programmers.com.ll.level1.p12954;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0;i<n;i++){
            answer[i] = x * (i+1);
        }
        return answer;
    }
}