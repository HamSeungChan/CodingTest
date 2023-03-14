package programmers.com.ll.level1.p12930;

public class Main {

    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String s) {

        String answer = "";
        boolean isUpperCase = true;

        char[] c = s.toCharArray();

        for (char x : c) {

            if (x == ' ') {
                answer += x;
                isUpperCase = true;
            } else if (isUpperCase) {
                answer += Character.toUpperCase(x);
                isUpperCase = false;
            } else {
                answer += Character.toLowerCase(x);
                isUpperCase = true;
            }
        }


        return answer;
    }
}