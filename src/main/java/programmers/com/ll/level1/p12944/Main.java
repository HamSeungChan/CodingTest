package programmers.com.ll.level1.p12944;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(new Solution().solution(arr));
    }
}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            answer += arr[i];
        }
        return answer / length;
    }
}