package programmers.com.ll.level1.p12937;

public class Main {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(new Solution().solution(num));
    }
}

class Solution {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
}