package programmers.com.ll.level1.p70129;

import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {

    }
}

class Solution {

    int removeCount = 0;
    int tryCount = 0;
    int[] answer;

    public int[] solution(String s) {
        DFS(s);
        return answer;
    }

    public String removeZero(String s) {
        for (char x : s.toCharArray()) {
            if (x == '0') removeCount++;
        }
        return s.replace("0", "");
    }

    public String change(int stringLength){
        StringBuilder sb = new StringBuilder();
        while(stringLength>0){
            sb.append(stringLength%2);
            stringLength = stringLength / 2;
        }
        return sb.reverse().toString();
    }

    public void DFS(String s) {
        if (s.length() == 1) {
            answer = new int[]{tryCount,removeCount};
            return;
        }
        tryCount++;
        String onlyOneString = removeZero(s);
        int stringLength = onlyOneString.length();
        DFS(change(stringLength));
    }
}