package programmers.com.ll.level1.p12918;

class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        for (char x : s.toCharArray()) {
            if (!Character.isDigit(x)) {
                return false;
            }
        }
        return answer;
    }
}


class OtherSolution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6)
            return s.matches("(^[0-9]*$)");
        return false;
    }
}