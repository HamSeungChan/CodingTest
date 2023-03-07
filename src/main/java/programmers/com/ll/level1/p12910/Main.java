package programmers.com.ll.level1.p12910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {

        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            int[] answer = {-1};
            return answer;
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

class OtherSolution {
    public int[] solution(int[] arr, int divisor) {

        int[] answer = Arrays
                .stream(arr)
                .filter(factor -> factor % divisor == 0)
                .toArray();
        if (answer.length == 0) answer = new int[]{-1};
        Arrays.sort(answer);
        return answer;
    }
}