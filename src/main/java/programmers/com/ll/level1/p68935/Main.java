package programmers.com.ll.level1.p68935;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

    }
}


class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add(n % 3);
            n = n / 3;
        }

        int j = 1;
        for (int i = list.size() - 1; i >= 0; i--) {

            answer += list.get(i) * j;
            j = j * 3;
        }

        return answer;
    }

    public int ten(int i) {

        int value = 1;
        for (int n = 0; n <= i; n++) {
            value *= 3;
        }

        return value;
    }
}