package programmers.com.ll.level1.p12909;

import java.util.Stack;

class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("()()"));
    }
}

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {

            if (stack.isEmpty()) {
                stack.push(x);
                continue;
            }

            else if (stack.peek()=='(' && x==')') {
                stack.pop();
                continue;
            }
            else {
                stack.push(x);
            }
        }

        if (stack.isEmpty()) return true;

        return false;
    }
}